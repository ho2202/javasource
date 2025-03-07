package extend;

public class CheckingTrafficAccount extends CheckingAccount {

    private boolean hasTrafficCard;

    public CheckingTrafficAccount(String ano, String owner, long balance, String cardNo, boolean hasTrafficCard) {
        super(ano, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() {
        return hasTrafficCard;
    }

    long payTrafficCard(String cardNo, int amount) throws Exception {
        // 교통비 지불
        if (!hasTrafficCard) {
            throw new Exception();
        }
        return pay(cardNo, amount);
    }
}
