package lambda.lambda3;

import org.ietf.jgss.GSSName;

public class GenericMain6 {
    public static void main(String[] args) {

        GenericFunction<String, String> upperCase = str -> str.toUpperCase();
        GenericFunction<String, Integer> stringLength = str -> str.length();
        GenericFunction<Integer, Integer> square = x -> x * x;
        GenericFunction<Integer, Boolean> isEven = num -> num % 2 == 0;

        System.out.println(upperCase.apply("hello"));
        System.out.println(stringLength.apply("hello"));
        System.out.println(square.apply(5));
        System.out.println(isEven.apply(5));
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T t);
    }

}

/*
HELLO
5
25
false
*/