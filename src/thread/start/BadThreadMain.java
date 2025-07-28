package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start...");

        HelloThread helloThread = new HelloThread();

        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");

        helloThread.run();  // 만약 이렇게 직접 run()을 실행하면...?

        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");
        System.out.println(Thread.currentThread().getName() + ": main() end...");
    }
}

/*
main: main() start...
main: start() 호출 전
main: run()
main: start() 호출 후
main: main() end...
*/