package lambda.todo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate<T>: 값을 1개 받아서 boolean 결과를 반환하는 인터페이스
 * test(T t)  => 조건 검사, 필터링, 검증 로직 에 자주 사용한다.
 */
public class Ex05PredicateLambdaTodo {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(95, 40, 80, 55, 100);

        // TODO: 60점 이상이면 true를 반환하는 Predicate<Integer>를 작성하세요.
        Predicate<Integer> isPass = score -> score >= 60;

        for (Integer score : scores) {
            if (isPass.test(score)) {
                System.out.println(score + "점: 합격");
            }
        }
    }
}

/**
 * 95점: 합격
 * 80점: 합격
 * 100점: 합격
 */