package src.exception;

public class Account {
    private String ano;
    private String owner;
    private long balance;

    public Account() {
    }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    void deposit(long cash) {
        balance += cash;
    }

    void withdraw(long cash) {
        if (balance < cash) {
            return;
        }
        balance -= cash;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
