package lambda.lambda5.map;

import java.util.List;

public class MapMainV3 {
    public static void main(String[] args) {

        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> mapStringToInteger = StringToIntegerMapper.map(list, s -> Integer.parseInt(s));
        System.out.println("mapStringToInteger = " + mapStringToInteger);

        // 문자열의 길이를 반환
        List<Integer> mapStringToLength = StringToIntegerMapper.map(list, s -> s.length());
        System.out.println("length = " + mapStringToLength);

        /*
        mapStringToInteger = [1, 12, 123, 1234]
        length = [1, 2, 3, 4]
        */
    }
}
