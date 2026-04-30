package stream1.todo;

import java.util.List;
import stream1.common.Student;

public class Ex11_CustomAggregateTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("홍길동", "남", 92),
                new Student("신용권", "남", 95),
                new Student("감자바", "남", 88)
        );

        // TODO 1: mapToInt + sum으로 점수 합계를 구하세요.
        int sum1 = students.stream().mapToInt(Student::getScore).sum();
        System.out.println("점수 합계: " + sum1);

        // TODO 2: map + reduce(0, (a, b) -> a + b)로 점수 합계를 구하세요.
        // 그냥 map() 처리기만 사용하면 별도의 기준을 reduce()로 정의해줘야 한다.
        Integer sum2 = students.stream().map(Student::getScore).reduce(0, Integer::sum);
        System.out.println("점수 합계: " + sum2);
    }
}
