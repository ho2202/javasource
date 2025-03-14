package api.util;

import java.util.HashSet;
import java.util.Set;

import api.object.Person;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Person> list = new HashSet<>();
        list.add(new Person("hong123", "홍길동"));
        list.add(new Person("park123", "박길동"));
        list.add(new Person("kim123", "김길동"));
        list.add(new Person("hong123", "홍길동"));
        list.add(new Person("kang123", "강길동"));

        System.out.println("아이디\t이름");
        System.out.println("--------------------------------");
        for (Person person : list) {
            System.out.printf("%s\n", person);
        }

        System.out.println(new Person("hong123", "홍길동").hashCode());
        System.out.println(new Person("hong123", "홍길동").hashCode());

    }
}
