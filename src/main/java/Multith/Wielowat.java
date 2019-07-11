package Multith;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Wielowat {


    int returnSumOf_N(int n){
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum+=i;
        }
        return sum;
    }
    Thread t1 = new Thread(() -> {
        System.out.println(returnSumOf_N(1_000_000_000));
        System.out.println(returnSumOf_N(2_000_000_000));
    });
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println(returnSumOf_N(1_000_000_000));
            System.out.println(returnSumOf_N(2_000_000_000));
        }
    });
    Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println(returnSumOf_N(2_100_000_000));
            System.out.println(returnSumOf_N(2_020_000_000));
        }
    });



    public static void main(String[] args) throws InterruptedException {
        Wielowat wielowat = new Wielowat();

        long l = System.currentTimeMillis();


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(wielowat.t1);


        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(wielowat.t2);


    }
}
