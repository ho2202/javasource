package api.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lotto1 = new TreeSet<>();

        // 중복 제거
        int aa = 0;
        for (int i = 0; 6 > lotto1.size(); i++) {
            int num = (int) (Math.random() * 45) + 1;
            lotto1.add(num);
            aa = i - 5;
        }
        System.out.println(lotto1 + " 재시도: " + aa);
        ;
        List<Integer> list = new ArrayList<>(lotto1);
        list.sort(Comparator.reverseOrder());

        System.out.println(list);
    }
}
