package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> evenNumbers = number -> number % 2 == 0;
        Predicate<Integer> oddNumbers = number -> number % 2 != 0;
        List<Integer> evenList = filter(numbers, evenNumbers);
        List<Integer> oddList = filter(numbers, oddNumbers);

        System.out.println("evenList = " + evenList);  // evenList = [2, 4, 6, 8, 10]
        System.out.println("oddList = " + oddList);  // oddList = [1, 3, 5, 7, 9]
    }

    static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }

        return result;
    }
}
