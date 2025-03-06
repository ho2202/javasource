package oop;

import java.util.Scanner;

public class AccountEx2 {

    private static Account account;
    static Scanner sc = new Scanner(System.in);

    private static Account createAcoount() {
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();
        System.out.print("이름 입력: ");
        String owner = sc.nextLine();
        System.out.print("잔액 입력: ");
        long balance = Long.parseLong(sc.nextLine());

        return new Account(ano, owner, balance);

    }

    private static void accointList(Account account) {
        System.out.println("=========================================================");
        System.out.println("계좌 목록");
        System.out.println("=========================================================");
        System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(), account.getBalance());
    }

    private static void deposit(Account account) {
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();

        if (ano.equals(account.getAno())) {
            System.out.print("예금액 입력: ");
            long balance = Long.parseLong(sc.nextLine());

            account.deposit(balance);
        }
    }

    private static void withdraw(Account account) {
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();

        if (ano.equals(account.getAno())) {
            System.out.print("출금액 입력: ");
            long balance = Long.parseLong(sc.nextLine());

            account.withdraw(balance);
        } else {
            System.out.println("잔액이 부족함");
        }
    }

    public static void main(String[] args) {
        // AccountEx2 obj = new AccountEx2();

        boolean run = true;
        while (run) {
            System.out.println("=========================================================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("=========================================================");
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    account = createAcoount();
                    break;
                case 2:
                    accointList(account);
                    break;
                case 3:
                    deposit(account);
                    break;
                case 4:
                    withdraw(account);
                    break;
                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("다시 입력하세요");
                    break;
            }
        }
        sc.close();
    }
}
