package lambda.lambda1;

public class LambdaSimple4 {
    public static void main(String[] args) {
        MyCall call1 = (int value) -> value * 2;  // 기본
        MyCall call2 = (value) -> value * 2;  // 타입 추론
        MyCall call3 = value -> value * 2;  // 매개 변수 1개, () 생략 가능

        System.out.println("call1.call(5); = " + call1.call(5));
        System.out.println("call2.call(5); = " + call2.call(5));
        System.out.println("call3.call(5); = " + call3.call(5));
    }

    interface MyCall {
        int call(int value);
    }
}

/*
call1.call(5); = 10
call2.call(5); = 10
call3.call(5); = 10
*/