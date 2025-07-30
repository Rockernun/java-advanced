package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV0 {
    public static void main(String[] args) {

        log("Start");
        Thread thread1 = new Thread(new Job(), "thread-1");
        Thread thread2 = new Thread(new Job(), "thread-2");

        thread1.start();
        thread2.start();
        log("End");
    }

    static class Job implements Runnable {

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            log("작업 완료");
        }
    }
}

/*
21:42:39.348 [     main] Start
21:42:39.350 [ thread-1] 작업 시작
21:42:39.350 [     main] End
21:42:39.350 [ thread-2] 작업 시작
21:42:41.355 [ thread-1] 작업 완료
21:42:41.355 [ thread-2] 작업 완료
*/
