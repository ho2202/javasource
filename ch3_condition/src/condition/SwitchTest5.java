package condition;

import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {
        // 90 a, 80 b, 70 c, f
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수(0~100) 입력: ");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);

        switch (user/10) {
            case 10:
            case 9:
                System.out.println("A 등급");
                break;
            case 8:
                System.out.println("B 등급");
                break;
            case 7:
                System.out.println("C 등급");
                break;
            default:
                System.out.println("f 등급");
                break;
        }
        scanner.close();
    }
}
