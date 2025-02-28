package loop;

import java.util.Scanner;

public class BreakEx3 {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (run) {
            System.out.println("=====================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("=====================================");
            System.out.print("메뉴 번호 입력 >> ");
            int menu = sc.nextInt();
            int amount;
            switch (menu) {
                case 1:
                    System.out.println("예금액을 입력 >> ");
                    amount = sc.nextInt();
                    balance += amount;
                    break;
                case 2:
                    System.out.println("출금액을 입력 >> ");
                    amount = sc.nextInt();
                    balance -= amount;
                    break;
                case 3:
                    System.out.println("잔액: " + balance);
                    break;
                case 4:
                    run = false;
                    break;

                default:
                    break;
            }
        }
        sc.close();
    }
}
