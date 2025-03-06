package oop;

import java.util.Scanner;

public class AccountEx3 {

    private static Account account[] = new Account[100];
    static Scanner sc = new Scanner(System.in);

    private static void createAcoount() {
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();
        System.out.print("이름 입력: ");
        String owner = sc.nextLine();
        System.out.print("잔액 입력: ");
        long balance = Long.parseLong(sc.nextLine());

        for (int i = 0; i < account.length; i++) {
            if (account[i] == null) {
                account[i] = new Account(ano, owner, balance);
                System.out.println("계좌 생성 완료");
                break;
            }
        }

    }

    private static void accointList() {
        System.out.println("=========================================================");
        System.out.println("계좌 목록");
        System.out.println("=========================================================");
        // for (int i = 0; i < account.length; i++) {
        // if (account[i] != null) {
        // System.out.printf("%s\t%s\t%d\n", account[i].getAno(), account[i].getOwner(),
        // account[i].getBalance());
        // }
        // }

        for (Account acc : account) {
            if (acc != null) {
                System.out.printf("%s\t%s\t%d\n", acc.getAno(), acc.getOwner(), acc.getBalance());
            }
        }
    }

    private static void deposit() {
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();

        Account acc = findAccount(ano);
        System.out.print("예금액 입력: ");
        long balance = Long.parseLong(sc.nextLine());

        acc.deposit(balance);
    }

    private static void withdraw() {
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();
        Account acc = findAccount(ano);

        System.out.print("출금액 입력: ");
        long balance = Long.parseLong(sc.nextLine());
        if (balance <= acc.getBalance()) {
            acc.withdraw(balance);
        } else {
            System.out.println("잔액이 부족함");
        }
    }

    private static Account findAccount(String ano) {
        Account result = new Account();

        for (Account acc : account) {
            if (acc != null) {
                if (ano.equals(acc.getAno())) {
                    result = acc;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // AccountEx2 obj = new AccountEx2();
        account[0] = new Account("1", "홍길동", 100);

        boolean run = true;
        while (run) {
            System.out.println("=========================================================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("=========================================================");
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    createAcoount();
                    break;
                case 2:
                    accointList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
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
