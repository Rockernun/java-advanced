package stream1.todo;

import java.util.Comparator;
import java.util.List;
import stream1.common.Student;

public class Ex07_SortingTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("홍길동", "남", 30),
                new Student("신용권", "남", 10),
                new Student("유미선", "여", 20)
        );

        // TODO 1: 점수 오름차순 정렬 후 출력
        // Student 클래스를 대상으로 Comparable이 구현되어 있지 않으므로 Comparator를 직접 기준 제시해야 함
        students.stream()
                .sorted(Comparator.comparing(Student::getScore))
                .forEach(System.out::println);

        // TODO 2: 점수 내림차순 정렬 후 출력
        System.out.println();
        students.stream()
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .forEach(System.out::println);
    }
}

/**
 * 신용권(남, 10)
 * 유미선(여, 20)
 * 홍길동(남, 30)
 *
 * 홍길동(남, 30)
 * 유미선(여, 20)
 * 신용권(남, 10)
 */
