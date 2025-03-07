package extend;

// import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // 부모의 인스턴스도 생성됨
        CheckingAccount cAccount = new CheckingAccount("110", "홍길동", 10000, "123-123");

        System.out.println(cAccount.getAno());
        System.out.println(cAccount.getOwner());
        System.out.println(cAccount.getBalance());
        System.out.println(cAccount.getCardNo());

        try {
            System.out.println("현재 잔액: " + cAccount.pay("123", 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        CreaditLineAccount crLnAcc = new CreaditLineAccount("100", "ㅂ", 12000, 40000);

        try {
            crLnAcc.withdraw(15000);
            System.out.println("현재 잔액: " + crLnAcc.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        BonusPointAccount bonusPointAccount = new BonusPointAccount("1234", "null", 100, 9000);
        bonusPointAccount.deposit(400);
        System.out.println(bonusPointAccount.getBonusPoint());
        bonusPointAccount.deposit(420);
        System.out.println(bonusPointAccount.getBonusPoint());

        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("null", "null", 1000, "1000", true);
        try {
            checkingTrafficAccount.payTrafficCard("11", 100);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
