package stream1.todo;

import java.util.Arrays;

public class Ex09_MatchingTodo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        // TODO 1: 모든 요소가 2의 배수인지 검사
        boolean isAllEven = Arrays.stream(arr).allMatch(n -> n % 2 == 0);
        System.out.println(isAllEven);

        // TODO 2: 하나라도 3의 배수가 있는지 검사
        boolean isAnyMultipleOfThree = Arrays.stream(arr).anyMatch(n -> n % 3 == 0);
        System.out.println(isAnyMultipleOfThree);

        // TODO 3: 3의 배수가 하나도 없는지 검사
        boolean isNoneMatchMultipleOfThree = Arrays.stream(arr).noneMatch(n -> n % 3 == 0);
        System.out.println(isNoneMatchMultipleOfThree);
    }
}

/**
 * true
 * true
 * false
 */
