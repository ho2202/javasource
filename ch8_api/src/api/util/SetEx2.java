package api.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        List<Integer> lotto = new ArrayList<>();
        Set<Integer> lotto1 = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            lotto.add(num);
        }
        System.out.println(lotto);

        // 중복 제거
        int aa = 0;
        for (int i = 0; 6 > lotto1.size(); i++) {
            int num = (int) (Math.random() * 45) + 1;
            lotto1.add(num);
            aa = i - 5;
        }
        System.out.println(lotto1 + " 재시도: " + aa);
    }
}
