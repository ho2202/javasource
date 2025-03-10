package poly;

public class Buyer {
    int money = 10000;
    int bonusPoint = 0;
    int i = 0; // products 에 사용할 인덱스
    Product products[] = new Product[10];

    // void buy(Tv tv) {
    // }
    // void buy(Product product) {
    // if (money < product.price) {
    // System.out.println("잔액 부족");
    // return;
    // }
    // money -= product.price;
    // bonusPoint += product.bonusPoint;
    // System.out.println(product + " 구매 완료");
    // }

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액 부족");
            return;
        }
        money -= product.price;
        bonusPoint += product.bonusPoint;
        products[i++] = product;
        System.out.println(product + " 구매 완료");
    }

    void summary() {
        int sum = 0;
        String itemList = "";
        // 총 가격과 상품 목록
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                break;
            }
            sum += products[i].price;
            itemList += products[i] + ", ";
        }
        System.out.println("구입하신 제품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + " 입니다.");
    }
}
