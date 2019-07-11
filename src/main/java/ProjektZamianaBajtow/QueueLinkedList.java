package ProjektZamianaBajtow;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front, rear;

    QueueLinkedList() {
        front = rear = null;
    }

    void enqueue(int data) {
        Node node = new Node(data);
        if (rear == null) {
            rear = front = node;
            return;
        }
        rear.next = node;
        rear = node; // rear przechodzi do nastepnego, bez tego rear tylko wksazuje na ostani element, np q.enqueue(4,9,22,111) -> zrobi 4, pozniej
        // 4 -> 9, pozniej 4 -> 22 i 4 -> 111, zamiast 4 -> 9, 4 -> 9 -> 22, 4 -> 9 -> 22 -> 111

    }

    void show() {
        Node n = front; // od frontu
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    int dequeue() {
        //  jezeli kolejka jest pusta
        if (front == null) {
            return -1;
        }
        int x = front.data;
        front = front.next;
        return x;

    }

    //


    int reverseNumber(int n) {
        int n2 = 0;
        while (n > 0) {
            // cyfra jednosci, dziesiatek, setek itd
            n2 = n2 * 10 + n % 10;
            n /= 10;
        }
        return n2;
    }

    String removeDuplicates(String s) {
        String s2 = "";
        int len = s.length();


        for (int i = 0; i < len - 1; i++) {
            char c = s.charAt(i);
            char c1 = s.charAt(i + 1);
            if (c != c1) {
                s2 += c;
            }
        }
        return s2;
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(4);
        q.enqueue(9);
        q.enqueue(22);
        q.enqueue(111);

        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();

        System.out.println(q.reverseNumber(123_321_456));

        System.out.println(q.removeDuplicates("ala ma kota"));
//        q.show();

        Map m = new HashMap();
        Set s = new LinkedHashSet();
        int a = 5;
        int b = 10;
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(a);
        System.out.println(b);

    }

}
