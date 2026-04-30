package stream1.todo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import stream1.common.Student;

public class Ex12_CollectingTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("감자바", "남", 95),
                new Student("오해영", "여", 93)
        );

        // TODO 1: 남학생만 List로 수집
        List<Student> manList = students.stream().filter(s -> s.getSex().equals("남")).collect(Collectors.toList());
        System.out.println(Arrays.toString(manList.toArray()));

        // TODO 2: 이름을 key, 점수를 value로 Map 수집
        Map<String, Integer> scoreMap = students.stream()
                .collect(Collectors.toMap(a -> a.getName(), b -> b.getScore()));

        // TODO 3: 성별 기준 groupingBy로 그룹핑
        Map<String, List<Student>> groupingBySex = students.stream().collect(Collectors.groupingBy(Student::getSex));

        // TODO 4: 성별 기준 평균 점수 Map을 수집
        Map<String, Double> averageScoreBySex = students.stream()
                .collect(Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getScore)));

        System.out.println("Todo1: " + manList);
        System.out.println("Todo2: " + scoreMap);
        System.out.println("Todo3: " + groupingBySex);
        System.out.println("Todo4: " + averageScoreBySex);
    }
}

/**
 * [홍길동(남, 92), 감자바(남, 95)]
 * Todo1: [홍길동(남, 92), 감자바(남, 95)]
 * Todo2: {오해영=93, 홍길동=92, 감자바=95, 김수영=87}
 * Todo3: {남=[홍길동(남, 92), 감자바(남, 95)], 여=[김수영(여, 87), 오해영(여, 93)]}
 * Todo4: {남=93.5, 여=90.0}
 */
