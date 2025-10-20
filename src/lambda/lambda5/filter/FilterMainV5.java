package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV5 {
    public static void main(String[] args) {

        // 숫자 필터
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("짝수: " + GenericFilter.filter(numbers, n -> n % 2 == 0));

        // 문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        System.out.println("길이가 2 이상인 문자열: " + GenericFilter.filter(strings, s -> s.length() >= 2));
    }
}
