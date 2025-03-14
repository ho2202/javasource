package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import api.object.Person;

public class MapEx2 {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person("h1", "홍길동"));
        map.put(2, new Person("h2", "홍길동"));
        map.put(3, new Person("h3", "홍길동"));
        map.put(4, new Person("h1", "홍길동4"));

        Set<Integer> set = map.keySet();
        Iterator<Integer> iter = set.iterator();

        while (iter.hasNext()) {
            Integer key = iter.next();
            Person p = map.get(key);
            System.out.println(p);
        }
    }
}
