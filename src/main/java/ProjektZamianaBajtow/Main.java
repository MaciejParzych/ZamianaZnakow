package ProjektZamianaBajtow;


import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    static JFrame mainFrame;

    public static void main(String[] args) {

        System.out.println("main: " + SwingUtilities.isEventDispatchThread());

        // 非同期で実行
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                showTodoList();
            }
        });
    }

    private static void showTodoList() {
        System.out.println("showTodoList: " + SwingUtilities.isEventDispatchThread());

        createMain();
        addTodoListPane();
        showMain();
    }

    /**
     * メインフレームの作成
     */
    private static void createMain() {
        mainFrame = new JFrame("ToDoリスト");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void addTodoListPane() {
        Container contentPane = mainFrame.getContentPane();
        JComponent newContentPane = new TodoListPane();
        contentPane.add(newContentPane, BorderLayout.CENTER);
    }

    private static void showMain() {
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}