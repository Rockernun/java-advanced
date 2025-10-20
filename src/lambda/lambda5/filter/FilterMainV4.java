package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV4 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("even numbers: " + IntegerFilter.filter(numbers, n -> n % 2 == 0));
        System.out.println("odd numbers: " + IntegerFilter.filter(numbers, n -> n % 2 != 0));

        /*
        even numbers: [2, 4, 6, 8, 10]
        odd numbers: [1, 3, 5, 7, 9]
        */
    }
}
