package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV2 {
    public static void main(String[] args) {

        log("main() start");

        // 익명 클래스: Runnable 인터페이스를 바로 구현해버려도 된다. (해당 기능을 특정 메서드 안에서만 사용할 경우)
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                log("run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }

}

/*
11:39:01.162 [     main] main() start
11:39:01.163 [     main] main() end
11:39:01.163 [ Thread-0] run()
*/
