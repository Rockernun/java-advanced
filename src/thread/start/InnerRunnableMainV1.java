package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {
    public static void main(String[] args) {

        log("main() start");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        log("main() end");
    }

    // 특정 클래스 내부에서만 사용할 것 같다면 정적 중첩 클래스로 처리해도 무방
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }
}

/*
11:36:59.850 [     main] main() start
11:36:59.851 [     main] main() end
11:36:59.851 [ Thread-0] run()
*/
