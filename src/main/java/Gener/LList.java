package Gener;

public class LList {

    <T> void display(T element) {
        System.out.println(element);
    }

    final int ZMIENNA_FINALNA0 = 322;
    final int ZMIENNA_FINALNA;
    static final int ZMIENNA_FINALNA2;


    static {
        ZMIENNA_FINALNA2 = 22;
    }
    LList(){
        ZMIENNA_FINALNA = 33;
    }

    public static void main(String[] args) {
        LList lList = new LList();
        lList.display(3);
        lList.display(10_000_000_000L);
        lList.display("Ala ma kota");
        int[] a = {3, 2, 4, 7, 6, 5, 1, 2, 3, 7, 6, 5, 1, 6, 6, 4, 2};
        System.out.println(firstNonRepeating(a));
    }

//    static int firstNonRepeating(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int j = 0;
//            for (j = i + 1; j < n; j++)
//                if (arr[i] == arr[j]) {
//                    break;
//                }
//            if (j == n) { //
//                return arr[i];
//            }
//        }
//
//        return -1;
//    }


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


}
