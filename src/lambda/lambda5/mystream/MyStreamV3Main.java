package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("학생1", 100),
                new Student("학생2", 70),
                new Student("학생3", 55),
                new Student("학생4", 90),
                new Student("학생26", 85),
                new Student("학생27", 89),
                new Student("학생28", 70),
                new Student("학생150", 90),
                new Student("학생157", 55)
        );

        // 점수가 80점 이상인 학생 이름을 추출
        List<String> result1 = ex1(students);
        System.out.println("result1 = " + result1);

        // 점수가 80점 이상이면서 번호가 2자릿수인 학생의 이름을 추출
        List<String> result2 = ex2(students);
        System.out.println("result2 = " + result2);

    }

    private static List<String> ex1(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();
    }

    private static List<String> ex2(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .filter(s -> s.getName().length() == 4)
                .map(s -> s.getName())
                .toList();
    }
}

/*
result1 = [학생1, 학생4, 학생26, 학생27, 학생150]
result2 = [학생26, 학생27]
*/
