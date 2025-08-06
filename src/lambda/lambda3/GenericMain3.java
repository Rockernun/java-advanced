package lambda.lambda3;

public class GenericMain3 {
    public static void main(String[] args) {

        ObjectFunction upperCase = new ObjectFunction() {
            @Override
            public Object apply(Object t) {
                return ((String) t).toUpperCase();
            }
        };

        String result1 = (String) upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object t) {
                return (Integer) t * (Integer) t;
            }
        };

        Integer result2 = (Integer) square.apply(3);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object obj);
    }

}

/*
result1 = HELLO
result2 = 9
*/