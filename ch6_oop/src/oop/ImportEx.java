package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
// import java.util.Scanner;
import static java.lang.Math.*; // 내부 요소들이 static이기 때문
// java.lang 패키지 자동 처리됨

// import extend.Parent;

public class ImportEx {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Parent parent = new Parent();

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("오늘 날짜: " + simpleDateFormat.format(date));

        System.out.println(min(1, 5));
        System.out.println(random());
    }
}
