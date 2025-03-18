package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString // toString 메소드 생성
@AllArgsConstructor // 멤버변수 모두 들어간 생성자
@NoArgsConstructor // 기본 생성자
@Getter
@Setter

public class Account {
    private String ano;
    private String owner;
    private long balance;

    // public Account() {
    // }

    // public Account(String ano, String owner, long balance) {
    // this.ano = ano;
    // this.owner = owner;
    // this.balance = balance;
    // }

    // public String getAno() {
    // return ano;
    // }

    // public String getOwner() {
    // return owner;
    // }

    // public long getBalance() {
    // return balance;
    // }

    // public void setBalance(long balance) {
    // this.balance = balance;
    // }

    void deposit(long cash) {
        balance += cash;
    }

    void withdraw(long cash) {
        if (balance < cash) {
            return;
        }
        balance -= cash;
    }

    // @Override
    // public String toString() {
    // return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance +
    // "]";
    // }

}
