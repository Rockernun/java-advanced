package lambda.todo;

import java.util.function.Function;

/**
 * Function<T, R>: T 타입값을 받아서 R 타입으로 변환하는 함수형 인터페이스
 */
public class Ex04FunctionLambdaTodo {
    static class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        User user1 = new User("박병욱", 29);

        // TODO: Function<User, String>을 람다식으로 작성하여 "박병욱(29세)" 형태로 변환하세요.
        Function<User, String> userFormatter = user -> user.name + "(" + user.age + "세)";
        System.out.println(userFormatter.apply(user1));
    }
}

/**
 * 박병욱(29세)
 */