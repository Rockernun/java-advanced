package lambda.lambda2;

import lambda.MyFunction;

// 람다를 반환
public class LambdaPassMain3 {
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add.apply(1, 2): " + add.apply(1, 2));

        MyFunction sub = getOperation("sub");
        System.out.println("sub.apply(1, 2): " + sub.apply(1, 2));

        MyFunction somethingElse = getOperation("somethingElse");
        System.out.println("somethingElse.apply(1, 2): " + somethingElse.apply(1, 2));
    }

    // 람다를 반환하는 메서드
    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (int a, int b) -> a + b;
            case "sub":
                return (int a, int b) -> a - b;
            default:
                return (int a, int b) -> 0;
        }
    }
}

/*
add.apply(1, 2): 3
sub.apply(1, 2): -1
somethingElse.apply(1, 2): 0
*/