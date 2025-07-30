package thread.control.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinTest1Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MyTask(), "t1");
        Thread t2 = new Thread(new MyTask(), "t2");
        Thread t3 = new Thread(new MyTask(), "t3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
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
22:48:40.417 [       t1] 1
22:48:41.424 [       t1] 2
22:48:42.430 [       t1] 3
22:48:43.437 [       t2] 1
22:48:44.443 [       t2] 2
22:48:45.448 [       t2] 3
22:48:46.450 [       t3] 1
22:48:47.451 [       t3] 2
22:48:48.457 [       t3] 3
모든 스레드 실행 완료!
*/