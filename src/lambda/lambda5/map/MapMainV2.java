package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {
    public static void main(String[] args) {

        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> mapStringToInteger = map(list, s -> Integer.valueOf(s));
        System.out.println("mapStringToInteger = " + mapStringToInteger);

        // 문자열의 길이를 반환
        List<Integer> mapStringToLength = map(list, s -> s.length());
        System.out.println("length = " + mapStringToLength);

        /*
        mapStringToInteger = [1, 12, 123, 1234]
        length = [1, 2, 3, 4]
        */
    }

    static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> result = new ArrayList<>();
        for (String s : list) {
            result.add(mapper.apply(s));
        }

        return result;
    }
}
