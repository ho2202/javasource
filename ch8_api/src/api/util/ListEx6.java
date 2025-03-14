package api.util;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx6 {
    public static void main(String[] args) {
        // 2015~2024년도 1년 단위로 입력 ex) 1 2 3 4 5 6 7 8 9 10
        // ArrayList에 저장 후 가장 키가 많이 자란 연도 출력
        // StringTokenizer 사용
        try (Scanner sc = new Scanner(System.in)) {

            ArrayList<Integer> tall = new ArrayList<>();
            int y = 2015;
            int big = 0;
            int grow = 0;

            System.out.print("2015~2024년도 키 입력: ");
            String input = sc.nextLine();
            StringTokenizer token = new StringTokenizer(input, " ");

            while (token.hasMoreTokens()) {
                tall.add(Integer.parseInt(token.nextToken()));
            }

            for (int i = 1; i < 10; i++) {
                grow = tall.get(i) - tall.get(i - 1);
                if (big < grow) {
                    big = grow;
                    y = i;
                }
            }
            System.out.printf("키가 가장 많이 자란 연도: %d년, 자란 키는 %d cm", y + 2015, big);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
