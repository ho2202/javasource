package condition;

import java.util.Scanner;

public class SwitchTest6 {
    public static void main(String[] args) {
        // 연산자, 피연산자 입력 받아 계산
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        
        System.out.print("연산자 입력: ");
        input = scanner.nextLine();
        char operator = input.charAt(0);

        System.out.print("정수 입력: ");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        int result;

        switch (operator) {
            case '+':
                result = num + num2;
                System.out.printf("%d + %d = %d",num, num2, num + num2);
                break;
            case '-':
                System.out.printf("%d - %d = %d",num, num2, num - num2);
                break;
            case '*':
                System.out.printf("%d * %d = %d",num, num2, num * num2);
                break;
            case '/':
                System.out.printf("%d / %d = %d",num, num2, num / num2);
                break;
            case '%':
                System.out.printf("%d %% %d = %d",num, num2, num % num2);
                break;
            default:
                System.out.println("입력값을 확인해 주세요");
                System.exit(0); // 프로그램 종료
        }
        scanner.close();
    }
}
