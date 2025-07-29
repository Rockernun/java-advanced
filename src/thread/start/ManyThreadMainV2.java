package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV2 {
    public static void main(String[] args) {

        log("main() start");

        HelloThread runnable = new HelloThread();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        log("main() end");
    }
}

/*
11:30:16.352 [     main] main() start
Thread-6: run()
Thread-8: run()
Thread-7: run()
Thread-9: run()
Thread-5: run()
Thread-2: run()
Thread-11: run()
Thread-1: run()
Thread-4: run()
Thread-13: run()
Thread-14: run()
...
Thread-88: run()
Thread-89: run()
Thread-90: run()
Thread-91: run()
Thread-93: run()
Thread-92: run()
Thread-94: run()
Thread-95: run()
Thread-96: run()
Thread-97: run()
Thread-98: run()
Thread-100: run()
11:30:16.360 [     main] main() end
Thread-99: run()
*/