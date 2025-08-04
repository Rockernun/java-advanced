package lambda.start;

import lambda.Procedure;

import java.util.Random;

// 리팩토링: lambda 사용
public class Ex1RefMainV4 {

    public static void hello(Procedure procedure) {

        long startNs = System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {

        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위의 눈: " + randomValue);
        });

        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}

/*
주사위의 눈: 3
실행 시간: 2652791ns
i = 1
i = 2
i = 3
실행 시간: 105334ns
*/
