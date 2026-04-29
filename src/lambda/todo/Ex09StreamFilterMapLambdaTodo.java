package lambda.todo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream은 컬렉션 데이터를 선언형으로 처리할 수 있게 해주는 API
 * filter() 조건에 맞는 데이터만 통과시키는 메서드, Predicate<T> 사용
 * map(): 데이터를 다른 형태로 변환, Function<T, R> 사용
 * collect(): Stream 처리 결과를 다시 List, Set, Map로 수집하는 메서드
 */
public class Ex09StreamFilterMapLambdaTodo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Park", "Choi");

        // 이름 길이가 4 이상인 값만 필터링하고, 대문자로 변환하여 List로 수집
        List<String> result = names.stream()
                .filter(name -> name.length() >= 4)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

/**
 * [PARK, CHOI]
 */