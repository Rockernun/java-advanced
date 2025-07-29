package thread.start.test;

import static util.MyLogger.log;

public class StartTest1Main {
    public static void main(String[] args) {

        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }

    static class CounterThread extends Thread {

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
11:51:50.259 [ Thread-0] value: 1
11:51:51.266 [ Thread-0] value: 2
11:51:52.271 [ Thread-0] value: 3
11:51:53.276 [ Thread-0] value: 4
11:51:54.282 [ Thread-0] value: 5
*/
