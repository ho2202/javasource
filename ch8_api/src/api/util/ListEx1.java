package api.util;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(55);
        list.add(45);
        list.add(3, 30);
        System.out.println(list);

        System.out.println("특정 위치 요소 조회 " + list.get(3));
        // System.out.println("특정 위치 요소 삭제 " + list.remove(1));
        System.out.println("특정 요소 삭제 " + list.remove(Integer.valueOf(30)));
        System.out.println(list);
    }
}
