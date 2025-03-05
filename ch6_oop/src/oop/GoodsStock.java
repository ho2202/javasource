package oop;

public class GoodsStock {

    String code;
    int stockNum;

    // public GoodsStock() {
    // }

    public GoodsStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    void addStock(int x) {
        stockNum += x;
    }

    void subStock(int x) {
        stockNum -= x;
    }

    @Override
    public String toString() {
        return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

}
