package thread.control;

import static util.MyLogger.log;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new MyRunnable(), "myThread");
        log("myThread.state1 = " + thread.getState());
        log("myThread.start()");
        thread.start();
        Thread.sleep(1000);
        log("myThread.state3 = " + thread.getState());
        Thread.sleep(4000);
        log("myThread.state5 = " + thread.getState());
        log("end");
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
                log("start");
                log("myThread.state2 = " + Thread.currentThread().getState());

                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");

                log("myThread.state4 = " + Thread.currentThread().getState());
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

/*
14:28:28.889 [     main] myThread.state1 = NEW
14:28:28.891 [     main] myThread.start()
14:28:28.891 [ myThread] start
14:28:28.891 [ myThread] myThread.state2 = RUNNABLE
14:28:28.891 [ myThread] sleep() start
14:28:29.894 [     main] myThread.state3 = TIMED_WAITING
14:28:31.896 [ myThread] sleep() end
14:28:31.898 [ myThread] myThread.state4 = RUNNABLE
14:28:31.898 [ myThread] end
14:28:33.900 [     main] myThread.state5 = TERMINATED
14:28:33.900 [     main] end
*/
