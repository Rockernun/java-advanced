package lambda.lambda5.map;

import java.util.List;

public class MapMainV4 {
    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "grape", "orange");

        // 대문자로 변환
        List<String> mapToUpperCase = GenericMapper.map(fruits, s -> s.toUpperCase());
        System.out.println("mapToUpperCase = " + mapToUpperCase);

        // 문자열의 길이로 변환
        List<Integer> mapToStringLength = GenericMapper.map(fruits, s -> s.length());
        System.out.println("mapToStringLength = " + mapToStringLength);

        // * 반복
        List<Integer> integers = List.of(1, 2, 3);
        List<String> star = GenericMapper.map(integers, n -> "*".repeat(n));
        System.out.println("star = " + star);
    }
}
