package Packg2;


//import java.util.Stack;

import java.util.*;

public class Queue {
    int capacity = 10;
    int front, rear;
    int[] arr;
    int size;

    Queue() {
        front = rear = 0;
        arr = new int[capacity];
    }

    void enqueue(int data) {
        arr[rear] = data;
        rear = (rear + 1) % capacity;


        size++;
    }


    int dequeue() {
        int data = arr[front];
        front = (front + 1) % capacity;

        size--;

        return data;
    }


    void show() {

        for (int i = 0; i < size; i++) {
            System.out.println(arr[(front + i) % capacity]);
        }

    }

    int nonDuplicateElement(int[] a) {
        int r = 0;
        int len = a.length;
        boolean swapped = false;
        for (int i = 0; i < len; i++) {
            swapped = false;
            for (int j = i + 1; j < len - 1; j++) {
                if (a[i] == a[j]) {
                    break;
                }
                if (j == (len - 2)) {
                    return a[i];
                }
            }

            r = a[i];
            System.out.println("ddddddddd " + a[i]);
        }
        return -1;

    }

    static int firstNonRepeating(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
            if (j == n) {
                return arr[i];
            }
        }

        return -1;
    }

    static int firstNonRepeating2(int[] a) {
        int len = a.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for (int i = 0; i < len; i++) {
            if (map.get(a[i]) == 1) {
                return a[i];
            }
        }
        return -1;
    }


    static int firstNonRepeating3(int[] a) {
        int len = a.length;
        Arrays.sort(a);
        for (int i = 1; i < len - 1; i++) {
            if (a[i - 1] != a[i] && a[i + 1] != a[i]) {
                return a[i];
            }
        }
        return -1;
    }

    static char firstNonRepeatedCharacter(String s) {
        char[] a = s.toCharArray();
        int len = a.length;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        for (char c : a) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return 0;
    }

    boolean isNumber(char c) {
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') {
            return true;
        } else {
            return false;
        }
    }

    boolean isStringIsNumbersOnly(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!isNumber(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "ala ma kotax, a kot ma ale";
//        System.out.println(firstNonRepeatedCharacter(s));

        int[] a = {1, 2, 3, 2, 1, 2, 4, 1121, 8, 4, 111, 3};
//        System.out.println(firstNonRepeating(a));
//        System.out.println(firstNonRepeating2(a));

        System.out.println(firstNonRepeating3(a));
        Arrays.sort(a);
        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println();

        System.out.println();
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(7);
        q.enqueue(3);


        Map m = new HashMap();
        m.put(3, 2);
        m.put(3, 4);
        m.put(5, 22);
        System.out.println(m.get(3));
        System.out.println(m.get(5));
        q.dequeue();
        q.dequeue();
//
//
        q.enqueue(7);
        q.enqueue(111);
//
//
        q.enqueue(13);
        q.enqueue(33);


//        q.show();

//        for (int i = 0; i <10 ; i++) {
//            for (int j = 111; j < 1111; j+=333) {
//                if (i==2){
//                    break;
//                }
//            }
//            System.out.println(i);
//
//        }


//        int[] a = {-3, -3, 2, 1, 3, 2, 3, 0, 8, 0, -3, 1, -3};
        System.out.println(q.nonDuplicateElement(a));
//        System.out.println(firstNonRepeating(a, a.length));

        java.util.Queue queue = new LinkedList();

        System.out.println(randomString(-229985452) + " " + randomString(-147909649));

        int[] a1 = {1, 3, 4, 22, 121, 444};
        int[] a2 = {221, 1112, -332, 3332, 112103};

        System.out.println(Arrays.toString(union(a1, a2)));

        System.out.println(removeDup("ala ma kota"));


    }

    static int[] union(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        for (int i = 0; i < a3.length; i++) {
            if (i < a1.length) {
                a3[i] = a1[i];
            } else {
                a3[i] = a2[i - a1.length];
            }
        }
        return a3;
    }

    static int[] union2(int[] a1, int[] a2) {
        int i = 0, j = 0;
        int m = a1.length;
        int n = a2.length;
        while (i < m && j < n) {
            if (a1[i] == 2) {

            }
        }
        return new int[]{3, 2};
    }

    static String removeDup(String s) {
        Set set = new HashSet();
        int len = s.length();
        String s2 = "";
        for (int i = 0; i < len; i++) {
            if (!set.contains(s.charAt(i))) {
                s2 += s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return s2;
    }

    public static String randomString(int i) {
        Random ran = new Random(i);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int k = ran.nextInt(27);
            if (k == 0)
                break;

            sb.append((char) ('`' + k));
        }

        return sb.toString();
    }

}


