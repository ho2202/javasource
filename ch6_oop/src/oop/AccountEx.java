package oop;

public class AccountEx {
    public static void main(String[] args) {
        Account acc = new Account();
        Account acc1 = new Account("110-123-1234", "user", 10000);

        acc1.deposit(200000);

        acc1.withdraw(150000);

        System.out.println(acc.getBalance());
        System.out.println(acc1.getBalance());
    }
}
