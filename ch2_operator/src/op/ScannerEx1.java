package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드로 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("두자리 정수 입력");
        // 값을 문자열로 받음
        String input = scanner.nextLine();
        // 문자열을 숫자로
        int num = Integer.parseInt(input);
        System.out.println("입력값 : "+ num);

        scanner.close();
    }
}
