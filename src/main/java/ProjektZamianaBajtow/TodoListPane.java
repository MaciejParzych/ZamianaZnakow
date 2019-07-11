package ProjektZamianaBajtow;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class TodoListPane extends JPanel {

    private DefaultListModel todoListModel;
    private JList todoList;
    private JTextField todoInputField;
    private JButton addButton;
    private JButton modifyButton;
    private JButton removeButton;


    public TodoListPane() {
        super(new BorderLayout());

        todoListModel = new DefaultListModel();
        todoList = new JList(todoListModel);
        todoList.addListSelectionListener(new TodoListSelectionHandler());
        JScrollPane listScrollPane = new JScrollPane(todoList);

        todoInputField = new JTextField();

        JPanel buttonPanel = new JPanel();
        addButton = new JButton("ss");
        modifyButton = new JButton("dd");
        removeButton = new JButton("zz");

        addButton.addActionListener(new AddActionHandler());
        modifyButton.addActionListener(new ModifyActionHandler());
        removeButton.addActionListener(new RemoveActionHandler());

        buttonPanel.add(addButton);
        buttonPanel.add(modifyButton);
        buttonPanel.add(removeButton);

        add(listScrollPane, BorderLayout.NORTH);
        add(todoInputField, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }


    private class AddActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            todoListModel.addElement(todoInputField.getText());
        }
    }


    private class ModifyActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (todoList.getSelectedIndices().length != 1) {
                return;
            }

            todoListModel.set(todoList.getSelectedIndex(), todoInputField.getText());
        }
    }


    private class RemoveActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (todoList.getSelectedIndices().length != 1) {
                return;
            }

            setButtonsEnabled(false);
            Thread removeThread = new RemoveThread(todoList.getSelectedIndex());
            removeThread.start();
        }
    }


    private class TodoListSelectionHandler implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {

            if (todoList.getSelectedIndices().length != 1) {
                return;
            }

            todoInputField.setText((String) todoList.getSelectedValue());
        }
    }


    private void doLongTask() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


    class RemoveThread extends Thread {
        int index;

        RemoveThread(int index) {
            this.index = index;
        }

        public void run() {
            doLongTask();

            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    todoListModel.remove(index);
                    setButtonsEnabled(true);
                }
            });
        }
    }


    private void setButtonsEnabled(boolean enabled) {
        addButton.setEnabled(enabled);
        modifyButton.setEnabled(enabled);
        removeButton.setEnabled(enabled);
    }
}
