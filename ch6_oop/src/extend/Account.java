package extend;

public class Account {
    private String ano;
    private String owner;
    private long balance;

    // public Account() {
    // }

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

    void withdraw(long cash) throws Exception {
        if (balance < cash) {
            throw new Exception("잔액 확인 바람");
        }
        balance -= cash;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
