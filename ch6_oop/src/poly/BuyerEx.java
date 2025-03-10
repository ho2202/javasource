package poly;

public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new Audio());
        buyer.buy(new Computer());

        buyer.summary();
        // System.out.println("남은 돈 " + buyer.money + "만원입니다");
        // System.out.println("현재 보너스 점수는 " + buyer.bonusPoint + "입니다");

    }
}
