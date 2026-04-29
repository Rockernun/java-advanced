package lambda.todo;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/**
 * Supplier<T>: 매개변수 없이 값을 생성해서 반환하느 함수형 인터페이스
 * 주문번호 자동 생성, 임시 비밀번호 생성, 현재 시간 생성, 기본값 지연 생성
 */

public class Ex03SupplierLambdaTodo {
    public static void main(String[] args) {
        Supplier<String> orderNoSupplier = () -> "ORDER" + LocalDateTime.now() ;
        System.out.println(orderNoSupplier.get());
    }
}

/**
 * ORDER2026-04-29T22:49:08.507033
 */
