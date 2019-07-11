package DLL;

public class DLL{
    static class Node{
        int data;
        Node next, prev;
        Node(int data){
            this.data = data;
        }
    }

    Node head;


    void show(){
        Node n = head;
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.head = new Node(11);
        dll.head.next = new Node(13);
        dll.head.next.next = new Node(18);
        dll.head.next.next.next = new Node(22);
        dll.head.next.next.next.prev = new Node(55);

        dll.show();


    }

}
