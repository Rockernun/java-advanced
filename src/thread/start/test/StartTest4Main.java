package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {

        Thread threadA = new Thread(new PrintAlphabet("A", 1000), "Thread-A");
        Thread threadB = new Thread(new PrintAlphabet("B", 500), "Thread-B");

        threadA.start();
        threadB.start();
    }

    static class PrintAlphabet implements Runnable {

        private String alphabet;
        private int ms;

        public PrintAlphabet(String alphabet, int ms) {
            this.alphabet = alphabet;
            this.ms = ms;
        }

        @Override
        public void run() {

            while(true) {
                log(alphabet);
                try {
                    Thread.sleep(ms);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/*
12:11:45.289 [ Thread-B] B
12:11:45.289 [ Thread-A] A
12:11:45.793 [ Thread-B] B
12:11:46.296 [ Thread-A] A
12:11:46.299 [ Thread-B] B
12:11:46.804 [ Thread-B] B
12:11:47.302 [ Thread-A] A
12:11:47.310 [ Thread-B] B
12:11:47.813 [ Thread-B] B
12:11:48.304 [ Thread-A] A
...
*/