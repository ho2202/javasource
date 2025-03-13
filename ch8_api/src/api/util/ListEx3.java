package api.util;

import java.util.ArrayList;
import java.util.List;

import api.object.Person;

public class ListEx3 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("hong123", "홍길동"));
        list.add(new Person("park123", "박길동"));
        list.add(new Person("kim123", "김길동"));
        list.add(new Person("gim123", "길동"));
        list.add(new Person("kang123", "강길동"));

        System.out.println("아이디\t이름");
        System.out.println("--------------------------------");
        for (Person person : list) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }

    }
}
