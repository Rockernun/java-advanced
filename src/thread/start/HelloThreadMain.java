package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start...");

        HelloThread helloThread = new HelloThread();

        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");

        helloThread.start();  // main 스레드가 Thread-0 스레드에게 알아서 run()을 실행하라고 지시

        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");
        System.out.println(Thread.currentThread().getName() + ": main() end...");
    }
}

/*
<1번 실행했을 때는 이랬는데>
main: main() start...
main: start() 호출 전
main: start() 호출 후
Thread-0: run()
main: main() end...

<2번 실행했을 뿐인데 호출 순서가 달라졌다.>
main: main() start...
main: start() 호출 전
main: start() 호출 후
main: main() end...
Thread-0: run()
*/