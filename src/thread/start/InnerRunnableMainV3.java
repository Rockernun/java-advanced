package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV3 {
    public static void main(String[] args) {

        log("main() start");

        // 익명 클래스: 변수 없이 직접 전달하는 것도 가능
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                log("run()");
            }
        });

        thread.start();

        log("main() end");
    }

}

/*
11:41:09.352 [     main] main() start
11:41:09.354 [     main] main() end
11:41:09.354 [ Thread-0] run()
*/
