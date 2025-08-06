package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExampleEx2 {

    // 고차 함수, 함수를 인자로 받아서 조건에 맞는 요소만 뽑는 filter
    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (int value : list) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(-5, -3, -1, 1, 3, 5, 7, 9);
        System.out.println("원본 리스트: " + numbers);

        // 음수만 뽑아내기
        List<Integer> negativeNumbers = filter(numbers, num -> num < 0);
        System.out.println("음수 리스트: " + negativeNumbers);

        // 양수만 뽑아내기
        List<Integer> positiveNumbers = filter(numbers, num -> num > 0);
        System.out.println("양수 리스트: " + positiveNumbers);

    }
}

/*
원본 리스트: [-5, -3, -1, 1, 3, 5, 7, 9]
음수 리스트: [-5, -3, -1]
양수 리스트: [1, 3, 5, 7, 9]
*/