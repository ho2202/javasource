package condition;

import java.util.Scanner;

public class IfTest7 {
    public static void main(String[] args) {
        // int num1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 ");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);
        
        if (num1 % 2 == 1 ){
            System.out.printf("%d는 홀수 입니다." , num1);
        } else {
            System.out.printf("%d는 짝수 입니다." , num1);
        }
        scanner.close();
    }
}
