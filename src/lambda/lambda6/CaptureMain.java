package lambda.lambda6;

public class CaptureMain {
    public static void main(String[] args) {

        final int final1 = 10;
        int final2 = 20;
        int changeValue = 30;

        // 1. 익명 클래스에서의 캡쳐
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 - final1: " + final1);
                System.out.println("익명 클래스 - final2: " + final2);

//                System.out.println("익명 클래스 - changeValue: " + changeValue);
            }
        };

        // 2. 람다 표현식에서의 캡쳐
        Runnable lambda = () -> {
            System.out.println("람다 - final1: " + final1);
            System.out.println("람다 - final2: " + final2);

//            System.out.println("람다 - changeValue: " + changeValue);
        };

        changeValue++;
    }
}
