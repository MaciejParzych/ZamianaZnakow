package Multith;


public class Volat {


    public int counter = 0;

    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            counter++;
        }
    });


    public static void main(String[] args) {

    }
}
