package extend;

public class BonusPointAccount extends Account {
    private int bonusPoint;

    public BonusPointAccount(String ano, String owner, long balance, int creaditLine) {
        super(ano, owner, balance);
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    void deposit(long cash) {
        super.deposit(cash);
        bonusPoint += (int) cash / 100;
    }
}
