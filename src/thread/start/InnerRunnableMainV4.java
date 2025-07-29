package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV4 {
    public static void main(String[] args) {

        log("main() start");

        // 익명 클래스: 변수 없이 직접 전달하는 것도 가능
        Thread thread = new Thread(() -> log("run()"));

        thread.start();

        log("main() end");
    }

}

/*
11:42:44.636 [     main] main() start
11:42:44.638 [     main] main() end
11:42:44.638 [ Thread-0] run()
*/
