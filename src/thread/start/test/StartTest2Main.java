package thread.start.test;

import static java.lang.Thread.sleep;
import static util.MyLogger.log;

public class StartTest2Main {
    public static void main(String[] args) {

        Thread counter = new Thread(new CounterRunnable(), "counter");
        counter.start();

    }

    static class CounterRunnable implements Runnable {

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
    }
}

/*
11:58:13.844 [  counter] value: 1
11:58:14.850 [  counter] value: 2
11:58:15.855 [  counter] value: 3
11:58:16.860 [  counter] value: 4
11:58:17.866 [  counter] value: 5
*/