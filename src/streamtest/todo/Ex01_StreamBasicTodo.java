package streamtest.todo;

import java.util.List;
import java.util.stream.Stream;

public class Ex01_StreamBasicTodo {
    public static void main(String[] args) {
        List<String> orderStatuses = List.of("READY", "PAID", "SHIPPING", "DONE");
        // TODO 1: orderStatuses에서 스트림을 얻으세요.
        Stream<String> orderStatusStream = orderStatuses.stream();

        // TODO 2: forEach를 사용해 각 주문 상태를 "상태: READY" 형식으로 출력하세요.
        orderStatusStream.forEach(System.out::println);
    }
}

/**
 * READY
 * PAID
 * SHIPPING
 * DONE
 */