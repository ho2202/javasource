package stream;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Member {
    private String name;
    private int gender;
    private int age;

    public static int MALE = 0;
    public static int FEMALE = 1;

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }
}
