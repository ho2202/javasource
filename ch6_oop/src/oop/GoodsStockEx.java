package oop;

public class GoodsStockEx {
    public static void main(String[] args) {

        // GoodsStock goodsStock = new GoodsStock();

        // goodsStock.code = "p1010";
        // goodsStock.stockNum = 50;

        GoodsStock goodsStock = new GoodsStock("p1010", 50);
        System.out.println(goodsStock);

        goodsStock.subStock(10);
        System.out.println(goodsStock);
    }

}
