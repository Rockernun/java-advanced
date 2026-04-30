package stream1.todo;

import java.util.List;

public class Ex02_InternalIteratorTodo {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "신용권", "감자바", "람다식", "박병렬");

        // TODO 1: 일반 stream의 forEach로 이름을 출력하세요.
        names.stream().forEach(name -> System.out.println("일반 처리: " + name));

        // TODO 2: parallelStream의 forEach로 이름과 현재 스레드명을 출력하세요.
        System.out.println();
        names.parallelStream().forEach(name -> System.out.println(name + ": " + Thread.currentThread().getName()));

    }
}
