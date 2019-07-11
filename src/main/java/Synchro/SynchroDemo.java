package Synchro;

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class SynchroDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        int n = 400_000_000;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < n; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < n; i++) {
                    c.increment();
                }
            }
        });

        long begin = System.currentTimeMillis();

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        long end = System.currentTimeMillis();


        System.out.println(c.count);

        System.out.println((end-begin));

    }
}
