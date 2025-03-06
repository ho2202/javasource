package oop;

public class TvEx {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Tv2 tv2 = new Tv2(50, "black");

        tv.size = 100;
        tv2.power();
        tv2.changeChannel(10);
        System.out.println(tv2.toString());

        Tv3 tv3 = new Tv3();
        System.out.println(tv3.toString());
    }
}
