package lambda.todo;

public class Ex01RunnableLambdaTodo {
    public static void main(String[] args) {
        // TODO: Runnable을 람다식으로 작성하여 "작업을 실행합니다."를 출력하세요.
        Runnable task = () -> System.out.println("작업을 실행합니다.");
        task.run();
        task.run();
        task.run();
        task.run();
    }
}

/**
 * 작업을 실행합니다.
 * 작업을 실행합니다.
 * 작업을 실행합니다.
 * 작업을 실행합니다.
 */
