package lambda.lambda4;

public class TriMain {
    public static void main(String[] args) {

        TriFunction<Integer, Integer, Integer, Integer> triFunction = (a, b, c) -> a + b + c;

        System.out.println("triFunction.apply(3, 4, 5) = " + triFunction.apply(3, 4, 5));
    }

    @FunctionalInterface
    interface TriFunction<A, B, C, D> {
        D apply(A a, B b, C c);
    }
}

// triFunction.apply(3, 4, 5) = 12