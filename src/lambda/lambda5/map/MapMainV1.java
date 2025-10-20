package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;

public class MapMainV1 {
    public static void main(String[] args) {

        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> numbers = mapStringToInteger(list);
        System.out.println("numbers = " + numbers);

        // 문자열의 길이를 반환
        List<Integer> length = mapStringToLength(list);
        System.out.println("length = " + length);
    }

    static List<Integer> mapStringToInteger(List<String> list) {
        List<Integer> result = new ArrayList<>();
        for (String s : list) {
            result.add(Integer.parseInt(s));
        }

        return result;
    }

    static List<Integer> mapStringToLength(List<String> list) {
        List<Integer> result = new ArrayList<>();
        for (String s : list) {
            result.add(s.length());
        }

        return result;
    }
}
