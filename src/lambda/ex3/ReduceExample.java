package lambda.ex3;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceExample {

    public static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> reducer) {
        int result = initial;

        for (int value : list) {
            result = reducer.apply(result, value);
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 4, 5, 6);
        System.out.println("리스트: " + numbers);

        // 리스트 안의 숫자의 모든 합 구하기
        int sum = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("모든 숫자의 합: " + sum);

        // 리스트 안의 숫자의 모든 곱 구하기
        int product = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("모든 숫자의 곱: " + product);
    }
}

/*
리스트: [3, 4, 5, 6]
모든 숫자의 합: 18
모든 숫자의 곱: 360
*/
