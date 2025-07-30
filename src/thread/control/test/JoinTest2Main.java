package thread.control.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinTest2Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MyTask(), "t1");
        Thread t2 = new Thread(new MyTask(), "t2");
        Thread t3 = new Thread(new MyTask(), "t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("모든 스레드 실행 완료!");
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                log(i);
                sleep(1000);
            }
        }
    }
}

/*
22:53:32.604 [       t2] 1
22:53:32.604 [       t1] 1
22:53:32.604 [       t3] 1
22:53:33.607 [       t2] 2
22:53:33.611 [       t1] 2
22:53:33.611 [       t3] 2
22:53:34.613 [       t2] 3
22:53:34.616 [       t1] 3
22:53:34.617 [       t3] 3
모든 스레드 실행 완료!
*/