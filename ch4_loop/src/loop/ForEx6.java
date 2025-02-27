package loop;

import java.util.Scanner;

public class ForEx6 {
    public static void main(String[] args) {
        // 팩토리얼
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(num + " 팩토리얼: "+ result);

        scanner.close();
    }
}
