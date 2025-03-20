package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "성춘향", "김자바");

        Stream<String> stream = list.stream();
        // forEach(Consumer<? super String> action)
        stream.forEach(s -> System.out.println(s));

        List<Student> students = Arrays.asList(new Student("홍길동", 90), new Student("신철용", 75));
        Stream<Student> stream2 = students.stream();
        stream2.forEach(st -> {
            String name = st.getName();
            int math = st.getMath();
            System.out.println(name + " " + math);
        });
        students.stream().forEach(stud -> System.out.println(stud));

    }
}
