package loop;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("100 이하의 정수 입력 >> ");
            input = scanner.nextInt();
            if (input < answer) {
                System.out.println("정답보다 작습니다.");
            } else if (input != answer) {
                System.out.println("정답보다 큽니다.");
            }
        } while (input != answer);

        System.out.println("정답! 프로그램을 종료합니다.");

        scanner.close();
    }
}
