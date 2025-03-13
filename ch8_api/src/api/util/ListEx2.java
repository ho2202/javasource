package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("바나나");
        list.add("딸기");
        list.add("귤");
        list.add("망고");
        list.add("포도");

        System.out.println("index로 제거" + list.remove(1));
        System.out.println("특정 요소 제거" + list.remove("귤"));

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("포함 여부 " + list.contains("키위"));
        System.out.println("포함 위치 " + list.indexOf("자몽"));
        String strr[] = { "사과", "포도", "바나나", "딸기", "수박" };
        List<String> list2 = Arrays.asList(strr);
        // 배열에서 리스트로 변경해서 추가나 삭제는 불가능
        // System.out.println("삭제 "+list2.remove(2));
        // list2.add("딸기");
        List<String> list3 = new ArrayList<>(Arrays.asList(strr));
        list3.add("딸기");
        list3.remove(2);
        System.out.println(list3);

        Object[] s = list3.toArray();
        System.out.println(Arrays.toString(s));
    }
}
