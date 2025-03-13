package api.util;

import java.util.LinkedList;
import java.util.List;

public class ListEx4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("apple");
        list.add("바나나");
        list.add("딸기");
        list.add("귤");
        list.add("망고");
        list.add("포도");
        System.out.println();

        for (String string : list) {
            System.out.println(string);
        }
        System.out.println(list.get(3));
        System.out.println(list.remove(3));
        System.out.println(list.indexOf("apple"));
    }
}
