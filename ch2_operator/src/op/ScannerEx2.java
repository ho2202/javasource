package op;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 키보드로 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 >> ");
        int input = scanner.nextInt();

        System.out.println(input);

        scanner.close();
    }
}
