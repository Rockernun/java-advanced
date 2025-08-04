package lambda.start;

public class Ex0RefMain {
    public static void main(String[] args) {
        printText("Java");
        printText("Spring");
    }

    static void printText(String text) {
        System.out.println("프로그램 시작");
        System.out.println("Hello " + text);
        System.out.println("프로그램 종료");
    }
}
