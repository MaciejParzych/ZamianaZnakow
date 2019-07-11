package ProjektZamianaBajtow;

//import ProjektZamianaBajtow.Trees2.Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StackAsLinkedList {

    Node root;

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
            root = newNode;
            min = data;
        } else {

            if (data < min) {
                min = data;
            }

            Node temp = root;
            root = newNode;
            newNode.next = temp;

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

    void print() {
        Node n = root;
    }


    void partition(int[] arr, int low, int high) {
        int pivot = arr[high];
    }

    void sort(int[] arr, int low, int high) {
        if (low < high) {

        }
    }

    int min;


    void show() {
        Node n = root;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }


    void deleteSecond() {
        Node n = root;
        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;
    }


    public static void main(String[] args) {
        StackAsLinkedList stackAsLinkedList = new StackAsLinkedList();
        stackAsLinkedList.push(41);
        stackAsLinkedList.push(2);
        stackAsLinkedList.push(3);
        stackAsLinkedList.push(4);
        stackAsLinkedList.push(5);
        stackAsLinkedList.push(6);
        stackAsLinkedList.pop();
        stackAsLinkedList.deleteSecond();
        Queue queue = new LinkedList();

//        System.out.println(stackAsLinkedList.peek());
        stackAsLinkedList.show();
//        System.out.println(stackAsLinkedList.isEmpty());
//        System.out.println(stackAsLinkedList.root.data);
        System.out.println();
        System.out.println();
//        System.out.println(stackAsLinkedList.min);

//        System.out.println(stackAsLinkedList.peek());

//        int[][] arr = new int[3][2];
//        arr = {{3,2,1},{4,3,2}};

//        int[][] arr = {{1, 2,4,6}, {3, 4,0, 45}, {3,7,1,23}};
//
//        int len = arr.length;
//        for (int i = 0; i < len; i++) {
////            System.out.println(Arrays.toString(arr[i]));
//        }

//        System.out.println(Arrays.toString(arr[0]));

        int[][] arr = {{1, 2, 3, 4}, {33, 4, 76, 111}};

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                int x = arr[0][i] * arr[1][j];
                System.out.println("Wynik mnozenia= " + x);

            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int n = 100;
//
//        n = 8;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j < 8; j = j * 2) {
//                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
//            }
//        }
//
//        int count = 0;
//
//        n = 100;
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 1; j < n + 1; j++) {
//                for (int k = 1; k < n + 1; k++) {
//                    for (int l = 1; l < n + 1; l *= 2) {
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);

        System.out.println(stackAsLinkedList.fibonacci(10));

    }

    int dodajCo3Element(int n){
        int sum = 1;
        for (int i = 1; i < n+1; i++) {
            if (i%3==0) { // i, a nie n
                sum*=i;
            }
        }
        return sum;
    }
    int fibonacci(int n) {

        if (n < 3) {
            return 1; // n czy 1 - chyba n, 10 element w fibonaccim to 55, n zwraca 0 w przypadku 0 i 1 w przypadku 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 10 element to 1815
    int tribonacci(int n) {
        if (n < 3) {
            return 0;
        }
        if (n == 3) {
            return 1;
        } else {
            return (tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3));
        }
    }
    int factorial(int n){
        int sum=1;
        for (int i = n; i>0; i--){
            sum*=i;
        }
        return sum;
    }
    /*
    You get the following result:
1 6
2 19
3 22
4 47
5 88
6 157
7 292
8 537
9 986
10 1815
11 3338
12 6139
13 11292
     */

    int fibonacciIteratively(int n) {
        int a = 0, b = 1, sum = 0;
        for (int i = 1; i < n; i++) { // n zamiast n+1
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

}



