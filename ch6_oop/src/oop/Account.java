package oop;

public class Account {
    String ano;
    String owner;
    long balance;

    public Account() {
    }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(long cash) {
        balance += cash;
    }

    void withdraw(long cash) {
        balance -= cash;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
