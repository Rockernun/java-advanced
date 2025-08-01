package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV2 {
    public static void main(String[] args) {

        log("Start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);

        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();  // main 스레드: thread1 일 시작해!
        thread2.start();  // main 스레드: thread2 일 시작해!

        log("main 스레드 sleep()");
        sleep(3000);
        log("main 스레드 깨어남");

        log("task1.result = " + task1.result);
        log("task2.result = " + task2.result);

        int sumAll = task1.result + task2.result;
        log("task1 + task2 = " + sumAll);
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
22:27:06.155 [     main] Start
22:27:06.156 [     main] main 스레드 sleep()
22:27:06.156 [ thread-1] 작업 시작
22:27:06.156 [ thread-2] 작업 시작
22:27:08.171 [ thread-1] 작업 완료 result = 1275
22:27:08.171 [ thread-2] 작업 완료 result = 3775
22:27:09.162 [     main] main 스레드 깨어남
22:27:09.163 [     main] task1.result = 1275
22:27:09.164 [     main] task2.result = 3775
22:27:09.164 [     main] task1 + task2 = 5050
22:27:09.165 [     main] End
*/