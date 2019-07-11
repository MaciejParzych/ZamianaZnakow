package ProjektZamianaBajtow;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Sorting {

//    void bubbleSort(int[] a) {
//        int n = a.length;
//        int temp = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (a[j] < a[i]) {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//    }

    public static int[] bubbleSortAscending(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            //check that last index has highest value in first loop,
            // second last index has second last highest value and so on
            System.out.println("Array after " + (i + 1) + "th iteration:" + Arrays.toString(arr));
        }
        return arr;
    }

    static void bubbleSort2(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    static void bubbleSort3(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

        }
    }

    static void bubbleSort44(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (swapped == false) {
                    break;
                }
            }
        }
    }

    static void bubbleSort(int[] arr) {
        int len = arr.length;
        int temp = 0;
        boolean swapped = false;

        for (int i = 0; i < len; i++) {
            swapped = false;

            for (int j = 1; j < (len - i); j++) { // len - i bo wraz ze wzrostem i
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }


//    static void bubbleSort44(int[] arr) {
//        int n = arr.length;
//        int temp = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < (arr.length - i); j++) {
//                if (arr[j - 1] > arr[j]) {
//                    temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] a = {41, 3, 23, -321, 94, 0, 2, 3, 2, -3141};
        int[] a2 = new int[30_000];
        for (int i = 1; i < a2.length - 1; i++) {
            Random r = new Random();
            a2[i] = i;
//            a2[i] = r.nextInt(1_000_000);
        }

        System.out.println(Arrays.toString(a2));

        long n1 = System.currentTimeMillis();

        bubbleSort(a2);

        long n2 = System.currentTimeMillis();
        System.out.println(Arrays.toString(a2));
        System.out.println((n2 - n1));
    }
}
