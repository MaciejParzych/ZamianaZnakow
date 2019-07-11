package Gener;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PrzykladGenerykow {
    static <T> void displayArray(T[] array) {
        for (T t : array) {
            System.out.print(t + "\t");
        }
        System.out.println();
    }

    static <T, K> void print(T t) {
        System.out.println(t);
    }

    static <T, K> void p(T... t) {
        System.out.println(Arrays.toString(t));
    }

    static <T, K> void add(T t, K k) {
        Integer integer = (Integer) t + (Integer) k;
        System.out.println(integer);
    }

    static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    int countOdds(Collection<Integer> c) {
        int count = 0;
        for (int i : c) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    static <T> void swap(T[] t, int i, int j) {
        T temp = t[i];
        t[i] = t[j];
        t[j] = t[i];
    }

    static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static double sum1(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    static int firstNonRepeating(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] == a[j]) {
                    break;
                } else if (j == (len - 1)) {
                    return a[i];
                }
            }
        }
        return -1;
    }

    static int[] merge2SortedArrays(int[] a, int[] a2) {
        int len = a.length, len2 = a2.length;
        int i = 0, j = 0, k = 0;
        int[] a3 = new int[len + len2];
        while (i < len && j < len2) {
            if (a[i] == a2[j]) {
                a3[k++] = a[i];
                i++;
                j++;
            } else if (a[i] < a2[j]) {
                a3[k++] = a[i];
                i++;
            } else {
                a3[k++] = a2[j];
                j++;
            }
        }
        while (i < len) {
            a3[k++] = a[i++];
        }
        while (j < len2) {
            a3[k++] = a2[j++];
        }
        return a3;
    }

    int[] merge3SortedArrays(int[] a1, int[] a2, int[] a3) {
        int len1 = a1.length, len2 = a2.length, len3 = a3.length;
        int i = 0, j = 0, k = 0, m = 0;
        int[] b = new int[len1 + len2 + len3];

        while (i < len1 && j < len2 && k < len3) {
            if (a1[i] == a2[j] && a2[j] == a3[k]) { // !!!
                b[m++] = a1[i];
                i++;
                j++;
                k++;
            }
            else {

            }
        }

        return new int[]{2,3};

    }

    public static void main(String[] args) {
        int[] aa = {0, 1, 2, 5, 6, 7, 8, 3, 9, 2, 4, 5, 1, 6, 7, 8};

        int[] a = {1, 3, 4, 7, 11, 22};
        int[] a2 = {2, 2, 4, 7, 11, 12, 23};
        int[] b1 = {2};
        int[] b2 = {4};
        System.out.println(Arrays.toString(merge2SortedArrays(b1, b2)));
        int[] a3 = merge2SortedArrays(a, a2);
        System.out.println(Arrays.toString(a3));

    }
}

class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
    }
}

class LinkedList<T> {
    Node head;

    void addBefore(T t) {
        Node node = new Node<>(t);
        node.next = head;
        head = node;
    }

    void traverse() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    void addAfter(T t) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        Node node = new Node<>(t);
        n.next = node;

    }

    void removeNthNodeFromTheEnd(int nth) {
        int count = 0;
        Node n = head;
        while (n != null) {
            count++;
            n = n.next;
        }
        n = head;
        int k = count - nth;

        while (k > 1) {
            k--;
            n = n.next;
        }
        n.next = n.next.next;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(22);
        linkedList.head.next = new Node<>(33);
        linkedList.head.next.next = new Node<>(44);
        linkedList.head.next.next = new Node(55);
        linkedList.head.next.next = new Node(66);
        linkedList.addBefore(1111);
        linkedList.addBefore("Ala ma kota");
        linkedList.addBefore(10_000_000_000L);
        linkedList.addBefore(1.123_456_789);
        linkedList.addAfter(12);
        linkedList.addAfter(13);
        linkedList.removeNthNodeFromTheEnd(2);
        linkedList.traverse();
    }
}

class Gen2 {
    Object t;

}