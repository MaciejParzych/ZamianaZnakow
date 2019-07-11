package Multith;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SharedObject {
    private  int count = 0;

    public void increamentCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

//    static int sortedSquares(int[] a){
//        int len = a.length;
//        int j = 0;
//
//        // przejscie wszystkich minusowych wartosci
//        while (j < len && a[j] < 0){
//            j++;
//        }
//        int i = j-1; // i wchodzi na miejsce j
//        int t = 0;
//        int[] a2 = new int[len];
//
//        while (i >= 0 && j<len ){
//            if (a[i] * a[i] < a[j] * a[j]){
//                a2[t] = a[i] * a[i];
//                i--;
//            }
//            else {
//
//            }
//
//        }
//    }

    String removeS(String s){
        int len = s.length();
        String s2 ="";
        for (int i = len-1; i > -1; i--) {
            boolean duplicate = false;
            for (int j = i-1; j > -1; j--) {
                if (s.charAt(i) == s.charAt(j)){
                    duplicate = true;
                    break;
                }

            }
            if (!duplicate){
                s2 += s.charAt(i);
            }

        }
        return s2;
    }

    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("ala ma kota");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });


    static String[] splitString(String s) {
        String s2 = "";
        int count = 0;
        int len = s.length();
        List<String> list = new LinkedList();

        // dodanie do listy słów oddzielonych spacją
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            s2 += c; // !!!!!!!! - sam nie wiem jak na to wpadłem
            if (c == ' ') {
                count++;
                list.add(s2);
                s2 = "";
            }
            if (i == (len-1)) { // !!!
                list.add(s2);

            }
        }

        String[] a = new String[count+1];
        int count2 = count; /// !!!
        for (String st : list) {
            a[count2--] = st;
        }
        return a;
    }

    static String reverseWordsInSentence(String s){
        String[] a = s.split(" ");
        int len = a.length;
        String s2 = "";
        for (int i = 0; i < len; i++) {
            s2 = s2 + a[len - i - 1] + " ";
        }
        return s2;
    }
    public static void main(String[] args) throws InterruptedException {

        System.out.println((new SharedObject()).removeS("alfa beta gamma"));




    }
}