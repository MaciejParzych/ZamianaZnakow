package Multith;

import java.io.File;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.util.*;

class Klasa1 {
    Klasa1() {
        System.out.println("Klasa1");
    }
}

class Klasa2 extends Klasa1 {
    Klasa2() {

    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        Klasa2 klasa2 = new Klasa2();


        int[] a = {2, 3, 1, 11, 91, 0, 112};

        int[] aa = new int[]{3, 23};


        int[] aa2 = {3, 23};


        System.out.println(klasa2.fib(11));
    }

    int fib(int n) {
        int sum = 0, a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }

    int[] twoSum(int[] a, int sum) {
        int len = a.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] a2 = new int[2];

        for (int i = 0; i < len; i++) {
            int temp = sum - a[i];
            if (map.containsKey(temp)) {
                a2[0] = i;

                a2[1] = map.get(temp);
                return a2;
            }
            map.put(a[i], i);
        }
        return a2;
    }

//    int[] returnIndicies(int[] a, int sum) {
//        int[] a2 = new int[2];
//        Map<Integer, Integer> map = new HashMap<>();
//        int len = a.length;
//
//        for (int i = 0; i < len; i++) {
//            int temp = sum - a[i];
//            if (map.containsKey(temp)) {
//                a2[0] = i;
//                a2[1] = map.get(temp);
//
//            }
//            map.put(a[i], i);
//        }
//        return a2;
//    }

    boolean ifSum(int[] a, int sum) {
        Arrays.sort(a);
        int len = a.length;
        int i = 0, j = len - 1;
        while (i < j) {
            int score = a[i] + a[j];
            if (score == sum) {
                return true;
            } else if (score < sum) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

//    static int singleNumber(int[] a){
//        int len = a.length;
//        Arrays.sort(a);
//        for (int i = 1; i < len-1; i++) {
//            if (a[i- 1] != a[i] && a[i] != a[i+1] ){
//                return a[i];
//            }
//        }
//        return -1;
//    }

    static int singleNumber(int[] a) {
        Map<Integer, Integer> m = new HashMap();
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int temp = a[i];
            if (m.containsKey(temp)) {
                m.put(temp, m.get(temp) + 1);
            } else {
                m.put(temp, 1);
            }
        }
        for (int i : m.keySet()) {
            if (m.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }

    static int mostFrequentElement(int[] a) {
        Map<Integer, Integer> m = new HashMap();
        int len = a.length;

        for (int i = 0; i < len; i++) {
            int temp = a[i];
            if (m.containsKey(temp)) {
                m.put(temp, m.get(temp) + 1);
            } else {
                m.put(temp, 1);
            }
        }
        int count = 0, max = 0, secondFreq = -1;
        for (int i : m.keySet()) {
            if (m.get(i) > count) {
                count = m.get(i);
                max = i;
            }
        }
        return max;
    }

    static boolean findIf2NumbersSumToXInSortedArray(int[] a, int sum) {
        int len = a.length;
        int i = 0,
                j = len - 1;

        while (i < j) {
            int score = a[i] + a[j];
            if (score == sum) {
                return true;
            } else if (score < sum) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

}

