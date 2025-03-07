package extend;

public class CreaditLineAccount extends Account {
    private int creaditLine; // 마이너스 한도

    public CreaditLineAccount(String ano, String owner, long balance, int creaditLine) {
        super(ano, owner, balance);
        this.creaditLine = creaditLine;
    }

    @Override
    void withdraw(long cash) throws Exception {
        if (super.getBalance() + creaditLine < cash) {
            throw new Exception("한도 범위를 초과합니다.");
        }
        super.setBalance(super.getBalance() - cash);
    }
}
