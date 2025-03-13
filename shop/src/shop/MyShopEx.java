package shop;

public class MyShopEx {
    public static void main(String[] args) {
        IShop shop = new MyShop();
        shop.setTitle("My shop");
        shop.getUser();
        shop.getProduct();
        shop.start();
    }
}
