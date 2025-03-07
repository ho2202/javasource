package extend;

public class CheckingAccount extends Account {
    // 은행계좌 + 체크카드
    private String cardNo;

    // public CheckingAccount() {
    // // 부모의 default 생성자 호출
    // super();
    // }

    public CheckingAccount(String ano, String owner, long balance, String cardNo) {
        // 부모의 생성자 호출
        super(ano, owner, balance);
        this.cardNo = cardNo;
    }

    long pay(String cardNo, int amount) throws Exception {
        if (this.cardNo.equals(cardNo) || getBalance() < amount) {
            throw new Exception("cardNo 또는 잔액을 확인해 주세요");
        }
        withdraw(amount);
        return getBalance();
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }
}
