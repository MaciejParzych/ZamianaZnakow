package Gener;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

public class LinkdLst {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void nextGreaterElement() {
        Node n = head, n2 = head;


        while (n != null && n.next!=null ) {
            n2 = n.next;
            int temp = n2.data; //
            while (n2 != null) { //
                if (n2.data > n.data) {
                    n.data = n2.data;
                    break;
                } else if (n2.next == null) {
                    n.data = -11;
                } else {
                    n2 = n2.next;
                }

            }

            n = n.next;
        }
    }


    public static void main(String[] args) {
        LinkdLst linkdLst = new LinkdLst();
        linkdLst.head = new Node(1);
        linkdLst.head.next = new Node(4);
        linkdLst.head.next.next = new Node(72);
        linkdLst.head.next.next.next = new Node(4);
        linkdLst.head.next.next.next.next = new Node(7);
        linkdLst.head.next.next.next.next.next = new Node(3);
        linkdLst.head.next.next.next.next.next.next = new Node(2);
//        linkdLst.head.next.next.next.next.next.next.next = new Node(1);


        linkdLst.traverse();
        System.out.println("-----");


        linkdLst.nextGreaterElement();





    }

    void removeDuplicatesInUnsortedLL() {
        Node n = head;
        Set<Integer> s = new HashSet<>();
        while (n != null && n.next != null) {
            if (s.contains(n.next.data)) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
            s.add(n.data);
        }
    }

    void traverse() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

}
