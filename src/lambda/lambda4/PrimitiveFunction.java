package lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {
    public static void main(String[] args) {

        // 기본형 매개 변수
        IntFunction<String> function = x -> "숫자: " + x;
        System.out.println("function.apply(100) = " + function.apply(100));

        // 기본형 반환
        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println("toIntFunction.applyAsInt(\"hello\") = " + toIntFunction.applyAsInt("hello"));

        // 기본형 매개 변수, 기본형 반환
        IntToLongFunction intToLongFunction = x -> x * 100L;
        System.out.println("intToLongFunction.applyAsLong(100) = " + intToLongFunction.applyAsLong(100));

        // IntUnaryOperator: int -> int
        IntUnaryOperator intUnaryOperator = x -> x * 100;
        System.out.println("intUnaryOperator.applyAsInt(100) = " + intUnaryOperator.applyAsInt(100));
    }
}


/*
function.apply(100) = 숫자: 100
toIntFunction.applyAsInt("hello") = 5
intToLongFunction.applyAsLong(100) = 10000
intUnaryOperator.applyAsInt(100) = 10000
*/