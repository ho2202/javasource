package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("id91", "홍길동");
        map.put("id92", "홍길");
        map.put("id93", "길동");
        map.put("id93", "홍동");

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
