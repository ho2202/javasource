package oop;

public class ClassEx1 {
    public static void main(String[] args) {

        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        System.out.println(tv1);
        System.out.println(tv2);

        tv2.power();
        tv1.channel = 8;
        tv1.color = "black";
        tv1.channelUp();

        tv2.volume = 22;

        System.out.println("현재 채널: " + tv1.channel);
        System.out.println("색상: " + tv1.color);
        System.out.println(tv1);
        System.out.println(tv2);
    }
}
