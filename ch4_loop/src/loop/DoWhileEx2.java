package loop;

import java.util.Scanner;

public class DoWhileEx2 {
    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("종료는 q 입력 >> ");
            input = scanner.nextLine();
            System.out.println(input);
        } while (!input.equalsIgnoreCase("q"));

        System.out.println("프로그램을 종료합니다.");

        scanner.close();
    }
}
