package lambda.lambda4;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {

        Predicate<Integer> predicate1 = new Predicate<>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;  // 짝수인지 판별
            }
        };

        System.out.println("predicate1.test(10) = " + predicate1.test(10));

        Predicate<Integer> predicate2 = n -> n % 2 == 0;
        System.out.println("predicate2.test(10) = " + predicate2.test(9));
    }
}

/*
predicate1.test(10) = true
predicate2.test(10) = false
*/