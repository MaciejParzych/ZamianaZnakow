package Multith;

import java.util.concurrent.Callable;

public class KlasaCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return null;
    }

    public static void main(String[] args) {
        KlasaCallable klasaCallable = new KlasaCallable();
        klasaCallable.notify();
    }
}
