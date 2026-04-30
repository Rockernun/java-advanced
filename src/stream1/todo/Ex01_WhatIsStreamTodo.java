package stream1.todo;

import java.util.HashSet;
import java.util.Set;

public class Ex01_WhatIsStreamTodo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("홍길동");
        names.add("신용권");
        names.add("김자바");

        // TODO 1: names에서 스트림을 얻고 forEach로 이름 출력
        names.stream().forEach(name -> System.out.println(name));
    }
}

/**
 * 김자바
 * 홍길동
 * 신용권
 */
