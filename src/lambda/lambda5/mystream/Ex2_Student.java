package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

public class Ex2_Student {
    public static void main(String[] args) {

        // 점수가 80점 이상인 학생의 이름을 추출
        List<Student> students = List.of(
                new Student("학생1", 100),
                new Student("학생2", 70),
                new Student("학생3", 55),
                new Student("학생4", 90),
                new Student("학생5", 85)
        );

        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    static List<String> direct(List<Student> students) {
        List<String> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= 80) {
                result.add(student.getName());
            }
        }

        return result;
    }

    static List<String> lambda(List<Student> students) {
        return GenericMapper.map(GenericFilter.filter(students, s -> s.getScore() >= 80), n -> n.getName());
    }
}
