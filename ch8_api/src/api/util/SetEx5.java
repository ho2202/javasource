package api.util;

import java.util.TreeSet;

public class SetEx5 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        String from = "", to = "b";

        set.add("abc");
        set.add("alien");
        set.add("car");
        set.add("bat");
        set.add("dice");
        set.add("CCCC");

        System.out.println(set);
        System.out.println(set.subSet(from, to));
        System.out.println(set.subSet(from, to + "c"));
    }
}
