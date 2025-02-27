package condition;

import java.util.Scanner;

public class IfTest9 {
    public static void main(String[] args) {
        // 윤년: 연도를 4로 나눈 나머지가 0이고, 100으로 나눈 나머지가 0이고, 400으로 나눈 나머지가 0 이다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도 입력: ");
        String input = scanner.nextLine();
        int years = Integer.parseInt(input);

        if (years % 100 != 0 && years % 4 == 0 || years % 400 == 0){
            System.out.println("윤년입니다.");
        } else {
            System.out.println("평년입니다.");
        }
        scanner.close();
    }
}
