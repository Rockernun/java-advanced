package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamLoopMain {
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
        List<String> result = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();

        // 외부 반복
        for (String s : result) {
            System.out.println("name: " + s);
        }

        // 추가
        MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .forEach(name -> System.out.println("name: " + name));
    }
}

/*
name: 학생1
name: 학생4
name: 학생26
name: 학생27
name: 학생150
*/
