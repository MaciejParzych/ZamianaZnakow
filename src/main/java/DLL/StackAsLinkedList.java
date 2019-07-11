package DLL;

public class StackAsLinkedList {

    Node root; // top

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }


    void push(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode; // jezeli root jest pusty  (czyli stack jest pusty) to utworz node
        } else {

            newNode.next = root;
            root = newNode;

        }
    }


    int peek() {
        return root.data;
    }

    int pop() {
        int x = root.data;
        root = root.next;
        return x;
    }

    boolean isEmpty() {
        return root == null;
    }

    public static void main(String[] args) {
        StackAsLinkedList stackAsLinkedList = new StackAsLinkedList();
        stackAsLinkedList.push(32);
        stackAsLinkedList.push(66);
        stackAsLinkedList.push(77);
        stackAsLinkedList.pop();

        System.out.println(stackAsLinkedList.root.data);
        System.out.println(stackAsLinkedList.root.next.data);


    }


}
