package op;

import java.util.Scanner;

public class LogicalEx2 {
    public static void main(String[] args) {
        // 문자를 입력받은 후 숫자인지 영문자인지 판별하는 프로그램
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자를 하나 입력하세요.");
        String input = scanner.nextLine();
        
        char ch = input.charAt(0);
        
        if ('0' <= ch && ch <= '9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        }
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력하신 문자는 영문자입니다.");
        }

        scanner.close();

    }
}
