package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV1 {
    public static void main(String[] args) {

        log("main() start");

        HelloThread runnable = new HelloThread();

        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();

        log("main() end");
    }
}

/*
11:23:23.614 [     main] main() start
11:23:23.615 [     main] main() end
Thread-3: run()
Thread-2: run()
Thread-1: run()
*/