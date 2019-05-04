package ProjektZamianaBajtow;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class LL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void traverse() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    int binarySearch(int[] a, int searched) {
        int left = 0, right = a.length, middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (searched == a[middle]) {
                return middle;
            } else if (searched <= a[middle]) {
                right = middle - 1;
            } else if (searched > a[middle]) {
                left = left + 1;
            }
        }
        return -1;

    }

    void addAfter(Node n, int data) {

    }

    void bubbleSort(int[] a) {
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    }

     int[] bubbleSort2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }


    public static void main(String[] args) {
        LL ll = new LL();
//        Node node = new Node(32);
//        Node node2 = new Node(54);
//        Node node3 = new Node(11);
//        ll.head = node;
//        ll.head.next = node2;
//        ll.head.next.next = node3;
//        ll.traverse();
//        int[] a = {3211, 2, 1, 4, 21, 422, 91, -321, -9111};
//        ll.bubbleSort(a);
//        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println();
        System.out.println();
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        long l = System.currentTimeMillis();
        ll.bubbleSort(arr);
        long l2 = System.currentTimeMillis();
        long dif  = l2-l;
        System.out.println(dif + " ms");

        System.out.println(Arrays.toString(arr));
//        System.out.println(-1286046471);
//        System.out.println(-1540897179);
    }
}














