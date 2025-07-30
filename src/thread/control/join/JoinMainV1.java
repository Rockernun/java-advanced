package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV1 {
    public static void main(String[] args) {

        log("Start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);

        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();  // main 스레드: thread1 일 시작해!
        thread2.start();  // main 스레드: thread2 일 시작해!

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
22:13:48.883 [     main] Start
22:13:48.885 [ thread-1] 작업 시작
22:13:48.885 [ thread-2] 작업 시작
22:13:48.887 [     main] task1.result = 0
22:13:48.887 [     main] task2.result = 0
22:13:48.887 [     main] task1 + task2 = 0
22:13:48.887 [     main] End
22:13:50.891 [ thread-1] 작업 완료 result = 1275
22:13:50.891 [ thread-2] 작업 완료 result = 3775
*/