package Tricks;

public class Modulo {

    static void printMultipleOfN(int n){
        for (int i = 1; i < 101; i++) {
            if (i%n==0){
                System.out.println(i);
            }
        }
    }
    static void dividersOfN(int n){
        for (int i = 1; i < n + 1; i++) {
            if (n%i==0){
                System.out.println(i);
            }
        }
    }

    // wyswietl liczby, ktore przy dzieleniu przez dana liczbe daja reszte 3
    static void whichReturnRest3(int n){
        for (int i = 1; i <100; i++) {
            if (n%i==3){
                System.out.println(i);
            }
        }

    }
//    static int restIsThree(int n){
//        int x=
//
//        return
//    }

    static void choinka(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int powerOf(int n, int x){
        int sum = 1;
        for (int i = 0; i < x ; i++){
            sum*=n;
        }
        return sum;
    }

    static int powerOf2(int n, int x){
        for (int i = 1; i < x;i++){
            n*=n;
        }
        return n;
    }

    //dividers of 100 - 1,2,5,10

    public static void main(String[] args) {
//        printMultipleOfN(7);
//        dividersOfN(100);

//        whichReturnRest3(10);

        choinka(20);

        System.out.println(powerOf(3,4));
        System.out.println(powerOf2(3,4));
        System.out.println();
        System.out.println();

    }
}
