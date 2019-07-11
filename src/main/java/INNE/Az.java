package INNE;

import java.util.*;

public class Az {
    // -2, 3, -4, 6, 5, 1, -4 ---> 3
    // -2, -4, 22, 1, -92 ---> 2
    static int numberOfBiggestSubsequenceOfPositiveNumber(int[] a) {
        int len = a.length;
        int count = 0, maxCount = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] > 0) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    static int mostRepeatingNumber(int[] a) {
        Arrays.sort(a);
        int len = a.length;
        int count = 0, maxCount = 0, index = 0;

        for (int i = 1; i < len; i++) { // i musi byc 1, bo jest i - 1
            if (a[i - 1] == a[i]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    index = a[i];
                }
            } else {
                count = 0;
            }
        }
        return index;
    }


    int[] interectionArray(int[] a, int[] a2) {
        int len = a.length, len2 = a2.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len2; j++) {
                if (a[i] == a2[j]) { // musi byc a2
                    list.add(a[i]);
                    a2[j] = Integer.MIN_VALUE;
                }
            }
        }
        int[] a3 = new int[list.size()];
        int count = 0;
        for (int i : list) {
            a3[count++] = i;
        }
        return a3;
    }

    static boolean isPerfect(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count += i;
            }
        }
        return count == n;
    }

    void showPerfectNumbers(int n) {
        for (int i = 1; i < n + 1; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    int[] findIntersection(int[] a, int[] a2) {
        Arrays.sort(a);
        Arrays.sort(a2);
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int len = a.length, len2 = a2.length;

        while (i < len && j < len2) {
            if (a[i] == a2[j]) { // !!! a2 - łatwo zrobić błąd
                list.add(a[i]);
                i++; // !!!
                j++; // !!!
            } else if (a[i] < a2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] a3 = new int[list.size()];
        int count = 0;
        for (int el : list) {
            a3[count++] = el;
        }
        return a3;
    }

    List findIntersection2(int[] a, int[] a2) {
        int len = a.length, len2 = a2.length;
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if (!m.containsKey(a[i])) {
                m.put(a[i], 1);
            } else {
                m.put(a[i], m.get(a[i]) + 1);
            }
        }

        for (int i = 0; i < len2; i++) {
            if (m.containsKey(a2[i])) {
                if (!m.get(a2[i]).equals(0)) {
                    list.add(a2[i]);
                    m.put(a2[i], m.get(a2[i]) - 1);
                }
            }
        }
        return list;
    }

    int[] intersectionUnique(int[] a, int[] a2) {
        Set<Integer> set = new HashSet();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            if (set.contains(a2[i])) {
                list.add(a2[i]);
                set.remove(a2[i]);
            }
        }
        int[] a3 = new int[list.size()];
        int count = 0;
        for (int i : list) {
            a3[count++] = i;
        }
        return a3;
    }

    List countCharacters(String[] a) {
        int[] count = new int[26];
        Arrays.fill(count, Integer.MIN_VALUE);

        System.out.println(Arrays.toString(count));
        return new LinkedList();
    }

    static void printMatrix() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int len = a.length;
        for (int i = 0; i < len; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }



    }
    static int sumOfMatrix(int[][] a){
        int len = a.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < a[i].length;j++)
                count+=a[i][j];
        }
        return count;
    }


     boolean threeSum(int[] a, int sum){
        int len = a.length;
        Arrays.sort(a);

        for (int i = 0; i < len; i++) {

            int temp = sum - a[i];
            int j = 0, k = len - 1;
            while (j < k){
                int t = a[j] + a[k];
                if (t == temp){
                    return true;
                }
                else if (t < temp){
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return false;
    }

    boolean fourSum(int[] a, int sum){
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j  = i+1; j < len; j++) {
                for (int k = j+1; k < len; k++) {
                    for (int l = k+1; l < len; l++) {
                        int temp = a[i] + a[j] + a[k] + a[l];
                        if (temp == sum){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Az az = new Az();
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] a2 = {{1, 2, 3}, {4, 5, 6, 221}, {7, 8, 9}, {10, 11,12}};
        System.out.println(sumOfMatrix(a));
//        int[] a = {2, 3, -4, 6, 5, 1, -4, 2, -4, 2, 2};
//        int[] b = {-4, 2, -4, 3, 111, 0, -22};
        String[] strings = {"Ala ma kota", "Alfa, beta", "kajak"};

        printMatrix();

        az.countCharacters(strings);


//        int[] a = {1, 1, 1, 3, 4, 7, 22};

        System.out.println("---");
        int[] b = {1, 1, 2, 3, 4, 5, 11, 22};
        System.out.println(az.threeSum(b, 38));

//        System.out.println(Arrays.toString(az.findIntersection(a, b)));
//
//        System.out.println(az.findIntersection2(a, b));
//
//        System.out.println(Arrays.toString(az.intersectionUnique(a, b)));

//        System.out.println(Arrays.toString((new Az()).interectionArray(a, b)));
//        System.out.println(numberOfBiggestSubsequenceOfPositiveNumber(a));
//        System.out.println(mostRepeatingNumber(a));
    }
}
