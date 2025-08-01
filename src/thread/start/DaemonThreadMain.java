package thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start");

        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);  // 데몬 스레드로 설정 (default: false -> 사용자 스레드)
        dt.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemonThread extends Thread {

        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + ": run()");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}

/*
<데몬 스레드 선택 시>
main: main() start
main: main() end
Thread-0: run()

<사용자 스레드 선택 시>
main: main() start
main: main() end
Thread-0: run()
Thread-0: run() end
*/