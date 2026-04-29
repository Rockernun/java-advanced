package lambda.todo;

import java.util.Optional;

/**
 * Optional<T>: null일 수 있는 값을 안전하게 다루기 위한 컨테이너다.
 * ofNullable() 메서드: 값이 null이어도 안전하게 Optional 객체를 생성해서 처리
 * orElse() 메서드: 값이 없을 때 사용할 기본값을 지정할 수 있다.
 *
 * if 문 같은거 쓰지 말고 그냥 null 값 처리할 때 Optional을 사용하도록 하자.
 */
public class Ex10OptionalLambdaTodo {
    public static void main(String[] args) {
        //email 값이 null 이 아니면 람다식을 실행하고 null이면 기본 문자열을 반환
        String email = "example@gmail.com";

        // Optional과 람다를 사용해서 email이 null이면 "이메일 없음" 을 출력
        String result = Optional.ofNullable(email).map(value -> "이메일: " + value).orElse("이메일 없음");
        System.out.println(result);  // 이메일 없음
    }
}

/**
 * 이메일에 값이 할당되었다면 "이메일: example@gmail.com" 출력
 * 이메일이 null 값이라면 "이메일 없음" 출력
 */
