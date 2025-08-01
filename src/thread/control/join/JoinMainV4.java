package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV4 {
    public static void main(String[] args) throws InterruptedException {

        log("Start");
        SumTask task1 = new SumTask(1, 50);

        Thread thread1 = new Thread(task1, "thread-1");

        thread1.start();  // main 스레드: thread1 일 시작해!

        // 스레드가 종료될 때까지 대기한다.
        log("join(1000) - main 스레드가 thread1 종료까지 1초 대기...");
        thread1.join(1000);
        log("main 스레드 대기 완료!");

        log("task1.result = " + task1.result);
        log("End");
    }

    static class SumTask implements Runnable {

        int startValue;
        int endValue;
        int result;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);

            int sum = 0;

            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }

            result = sum;

            log("작업 완료 result = " + result);
        }
    }
}

/*
22:42:16.325 [     main] Start
22:42:16.327 [     main] join(1000) - main 스레드가 thread1 종료까지 1초 대기...
22:42:16.327 [ thread-1] 작업 시작
22:42:17.332 [     main] main 스레드 대기 완료!
22:42:17.339 [     main] task1.result = 0
22:42:17.340 [     main] End
22:42:18.334 [ thread-1] 작업 완료 result = 1275
*/