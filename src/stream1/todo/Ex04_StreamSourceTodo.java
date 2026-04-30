package stream1.todo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_StreamSourceTodo {
    public static void main(String[] args) throws Exception {
        List<String> names = List.of("A", "B", "C");
        String[] arr = {"홍길동", "신용권", "김미나"};
        Path path = Path.of("src/resources/products.txt");

        // TODO 1: 컬렉션 스트림으로 names 출력
        names.stream().forEach(System.out::println);

        // TODO 2: 배열 스트림으로 arr 출력
        Arrays.stream(arr).forEach(System.out::println);

        // TODO 3: IntStream.rangeClosed(1, 5) 출력
        IntStream.rangeClosed(1, 5).forEach(System.out::print);
        System.out.println();

        // TODO 4: Files.lines(path)로 파일 내용을 출력하고 리소스를 닫으세요.
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }
    }
}
