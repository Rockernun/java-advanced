package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExample {

    public static List<String> map(List<String> list, UnaryOperator<String> operator) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(operator.apply(s));
        }

        return result;
    }

    public static void main(String[] args) {

        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        // 대문자 변환
        List<String> upperCaseList = map(words, word -> word.toUpperCase());
        System.out.println("대문자 변환 결과: " + upperCaseList);

        // 문자 꾸미기
        List<String> decoratedList = map(words, word -> "💥" + word + "💥");
        System.out.println("꾸민 문자 결과: " + decoratedList);
    }
}

/*
원본 리스트: [hello, java, lambda]
대문자 변환 결과: [HELLO, JAVA, LAMBDA]
꾸민 문자 결과: [💥hello💥, 💥java💥, 💥lambda💥]
*/