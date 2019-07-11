package Graphs.WeightedGraph;

import java.util.*;

public class WGraphSubClass extends WeightedGraph {
    static int[] removeDuplicates(int[] a) {
        int len = a.length;

        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < len; i++) {
            set.add(a[i]);
        }
        int count = 0;
        int[] a2 = new int[set.size()];
        for (int i : set) {
            a2[count++] = i;

        }
        return a2;
    }

    static String reverseWords(String s) {
        String s2 = "";
        int count = 0;
        int len = s.length();
        List<String> list = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            s2 += c;
            if (c == ' ') {
                count++;
                list.add(s2);
                s2 = "";
            }
            if (i == (len - 1)) {
                list.add(s2);

            }
        }
        int count2 = count;
        String[] arr = new String[count + 1];
        String s3 = "";

        for (String st : list) {
            arr[count--] = st;
        }
        for (String st2 : arr) {
            s3 += st2;
        }


        return s3;

    }

    public static void main(String[] args) {
        int[] a = {1, 22, 21, 33, 22, 21, 33, 1, 7, 4};
        System.out.println(Arrays.toString(removeDuplicates(a)));
        String s = "Ala ma kota a kot ma Ale";
        System.out.println(reverseWords(s));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        try {
            System.exit(1);
        }
        finally {
            System.out.println("Finally");
        }
    }

    static int reverseInt(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 10);
            n /= 10;
        }
        int n2 = 0;
        for (int i : stack) {
            n2 = n2 * 10 + i;
        }
        return n2;
    }
}
