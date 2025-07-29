package thread.start.test;

import static java.lang.Thread.sleep;
import static util.MyLogger.log;

public class StartTest3Main {
    public static void main(String[] args) {

        Runnable runnable = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    log("value: " + i);
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread thread = new Thread(runnable, "counter");
        thread.start();
    }
}

/*
12:05:12.016 [  counter] value: 1
12:05:13.023 [  counter] value: 2
12:05:14.029 [  counter] value: 3
12:05:15.033 [  counter] value: 4
12:05:16.035 [  counter] value: 5
*/