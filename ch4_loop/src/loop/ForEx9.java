package loop;

import java.util.Scanner;

public class ForEx9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 행 갯수 입력 >>");
        int input = scanner.nextInt();

        for (int i = 1; i < input + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}