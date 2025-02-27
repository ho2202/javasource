package condition;

import java.util.Scanner;

public class IfTest10 {
    public static void main(String[] args) {
        int num1, num2, num3, big, small;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("첫번째 수 입력: ");
        String input = scanner.nextLine();
        num1 = Integer.parseInt(input);

        System.out.print("두번째 수 입력: ");
        input = scanner.nextLine();
        num2 = Integer.parseInt(input);

        System.out.print("세번째 수 입력: ");
        input = scanner.nextLine();
        num3 = Integer.parseInt(input);

        if(num1 < num2) {
            big = num2;
            small = num1;
        } else {
            big = num1;
            small = num2;
        }
        if (big < num3) { 
            big = num3; 
        }
        if (small > num3) { 
            small = num3; 
        }
        System.out.println("가장 큰 수: \t"+ big);
        System.out.println("가장 작은 수: \t"+ small);

        scanner.close();
    }
}
