package DLL;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.*;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
    }
}

public class Tree {
    Node root;



    public int calculateSum(Node temp) {
        int sum, sumLeft, sumRight;
        sum = sumRight = sumLeft = 0;

        if (root == null) {
            return 0;
        } else {
            if (temp.left != null)
                sumLeft = calculateSum(temp.left);

            if (temp.right != null)
                sumRight = calculateSum(temp.right);

            sum = temp.data + sumLeft + sumRight;
            return sum;
        }
    }

    void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
    }

    void printInOrder() {
        printInOrder(root);
    }


    String reverseInPlace(String s) {
        char[] a = s.toCharArray(); // time - O(n), space - O(n)
//        int i = 0, j = a.length - 1;
//        while (i < j){
//            swap(a, i, j);
//            i++;
//            j--;
//        }
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            swap(a, i, j);
        }
        return String.valueOf(a);
    }

    int[] reverseArray(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
        return a;
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    int[] reverseArray2(int[] a) {
        int len = a.length;
        int[] a2 = new int[len];
        for (int i = 0; i < len; i++) {
            a2[i] = a[len - i - 1];
        }
        return a2;
    }

    int[] reverseArray3(int[] a) {
        int len = a.length;
        int[] a2 = new int[len];
        int count = 0;
        for (int i = len - 1; i > -1; i--) {
            a2[count++] = a[i];
        }
        return a2;
    }

    String reverseString2(String s) {
        String s2 = "";
        int len = s.length();
        for (int i = len - 1; i > -1; i--) {
            s2 += s.charAt(i);

        }
        return s2;
    }

    void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    int[] reverseArray4(int[] a) {
        Stack<Integer> st = new Stack<>();
        int len = a.length;
        for (int i = 0; i < len; i++) {
            st.push(a[i]);
        }
        for (int i = 0; i < len; i++) {
            a[i] = st.pop();
        }
        return a;
    }

    String reverse(String s) {
        if (s.length() < 2) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

    void reverseAnArray(int[] a) {
        reverseAnArray(a, 0, a.length - 1);
    }

    void reverseAnArray(int[] a, int i, int j) {
        if (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            reverseAnArray(a, ++i, --j);
        }
    }

    String reverseString11(String s) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            queue.add(c);
        }
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = queue.remove();
            s2 += c;
        }
        return s2;
    }


    Queue reverseQueue(Queue q) {
        Stack st = new Stack();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        return q;
    }

    Stack reverseStack(Stack st) {
        Stack st2 = new Stack();
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        return st2;
    }

    int[] rotateLeftAnArray(int[] a, int n) {
        int len = a.length, count = 0;
        int[] a2 = new int[len];
        for (int i = n; i < len; i++) {
            a2[count++] = a[i];
        }
        for (int i = 0; i < n; i++) {
            a2[count++] = a[i];
        }
        return a2;
    }


    public void rotateRight(int[] nums, int n) {

        int len = nums.length, count = 0;
        if (n == len) {
            return;
        }
        if (n > len) {
            n = n % len;
        }
        int[] a2 = new int[len];
        for (int i = len - n; i < len; i++) {
            a2[count++] = nums[i];
        }
        for (int i = 0; i < len - n; i++) {
            a2[count++] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = a2[i];
        }
    }

    public void rotateLeft(int[] a, int n) {
        int len = a.length, count = 0;
        int[] a2 = new int[len];
        if (n > len) {
            n = n % len;
        }

        for (int i = n; i < len; i++) {
            a2[count++] = a[i];
        }
        for (int i = 0; i < n; i++) {
            a2[count++] = a[i];
        }
        for (int i = 0; i < len; i++) {
            a[i] = a2[i];
        }
    }

    int findIndexOf(String s, String s2) {
        int len = s.length();
        int len2 = s2.length();

        for (int i = 0; i < len - len2; i++) {
            for (int j = 0; j < len2; j++) {
                if (s.charAt(i + j) != s.charAt(j)) { // i + j
                    break;
                } else if (i == j) {
                    return i;
                }
            }
        }
        return -1;
    }

    void printIndexes(String s, String s2) {
        int len = s.length(), len2 = s2.length();

        for (int i = 0; i <= len - len2; i++) {

            for (int j = 0; j < len2; j++) {
                if (s.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
                if (j == (len2 - 1)) { // len2 - 1
                    System.out.println("pattern found " + i);
                }
            }

        }
    }

    void printIndexOptimized(String s, String s2) {
        int len = s.length(), len2 = s2.length();

        int i = 0;
        while (i <= len - len2) {
            int j;
            for (j = 0; j < len2; j++) {
                if (s.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if (j == len2) {
                System.out.println("pattern found " + i);
                i += len2;
            } else if (j == 0) {
                i++;
            } else {
                i += j;
            }
        }
    }






    public static void main(String[] args) {


        System.out.println("----");
        Tree tree2 = new Tree();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        tree2.rotateLeft(a, 2);
        System.out.println(Arrays.toString(a));
        Tree tree = new Tree();

        String s = "Ala ma kota";
        tree.printIndexes(s, "kot");
        tree.printIndexOptimized(s, "kot");



        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
    }
}
