package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(new Member("홍길동", Member.MALE, 30), new Member("김나리", Member.FEMALE, 20),
                new Member("김정환", Member.MALE, 45), new Member("성춘향", Member.FEMALE, 27));
        int age = 0, i = 0;
        for (Member member : members) {
            if (member.getGender() == Member.MALE) {
                age += member.getAge();
                i++;
            }
        }
        System.out.println("남자 평균 나이: " + age / i);
        // member.getAge() == Member::getAge
        // filter(Predicate<? super Member> predicate)
        double avg = members.stream().filter((member) -> member.getGender() == Member.MALE).mapToInt(Member::getAge)
                .average().getAsDouble();
        System.out.println("남자 평균 나이: " + avg);

    }
}
