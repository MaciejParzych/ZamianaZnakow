import java.util.*;

class KlasaA {
    String string;
}

class KlasaB {
    String string;
}

public class Outputs {

    static int linearSearch(int[] a, int el) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (el == a[i]) {
                return i;
            }
        }
        return -1;
    }

    static int searchNear(int[] a, int n, int near) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (a[i] >= (n - near) && a[i] <= (n + near)) {
                return i;
            }
        }
        return -1;
    }

    int findClosest(int[] a, int x) {
        int len = a.length;
        int closest = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < len; i++) {
            int diff = x - a[i];
            if (absolute(diff) < closest) {
                closest = absolute(diff);
                index = i;
            }
        }
        return index;
    }


    int absolute(int n) {
        if (n > 0) {
            return n;
        } else {
            return -n;
        }
    }

    boolean isSortedAscending(int[] a) {
        int len = a.length;
        for (int i = 1; i < len; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }

//    int[] findIntersection(int[] a, int[] a2) {
//        int len = a.length, len2 = a2.length;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len2; j++) {
//                if (a[i] == a2[j] && !list.contains(a[i])) {
//                    list.add(a[i]);
//                }
//            }
//        }
//        int[] a3 = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            a3[i] = list.get(i);
//        }
//        return a3;
//    }

    List findIntersection(int[] a, int[] a2) {
        int len = a.length, len2 = a2.length;
        Map<Integer, Integer> m = new HashMap();
        List<Integer> list = new LinkedList();
        for (int i = 0; i < len; i++) {
            if (!m.containsKey(a[i])) {
                m.put(a[i], 1);
            } else {
                m.put(a[i], m.get(a[i]) +1);
            }
        }

        for (int i = 0; i < len2; i++) {
            if (m.containsKey(a2[i])) {
                if (!m.get(a2[i]).equals(0)) {
                    list.add(a2[i]);
                    m.put(a2[i], m.get(a2[i] ) - 1);
                }
            }
        }
        return list;
    }

    int findMinInSortedAndRotatedArray(int[] a){
        int left = 0;
        int right = a.length - 1;

        // jezeli nie jest rotated
        if (!(a[left] > a[right])){
            return a[0];
        }

        while (a[left] > a[right]){
            int mid = (left+right)/2;

            if (a[mid] > a[right]){ // dopoki
                left = mid+1;
            }
            else {
                right = mid;
            }
        }
        return a[left];
    }

    public static void main(String[] args) {


        int[] arr = {6, 2, 2, 2, 2, 2, 2, 4222, 4222,  122, 3, 1223, 21, 33, 215, 4222, 111111};
//        Arrays.sort(arr);
        int[] arr2 = {2, 1, 2, 2, 2, 4222, 3, 3, 4, 11, 22, 33, 44, 55555};

        Outputs outputs = new Outputs();
//        System.out.println(outputs.findClosest(arr, 2400));
//        System.out.println(outputs.isSortedAscending(arr2));

        System.out.println(outputs.findIntersection(arr, arr2));

        int[] arr33 = {55,66,66,67,68,69,88,88,2,2,3};
        System.out.println(outputs.findMinInSortedAndRotatedArray(arr33));

    }
}
