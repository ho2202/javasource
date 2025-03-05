package oop;

public class PrimitiveParamEx {
    static void change(int x) {
        x = 10000;
        System.out.println("change() : x = " + x);
    }

    static void change2(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x);
    }

    public static void main(String[] args) {
        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // change();
        // obj.change();
        Data d = new Data();
        d.x = 100;
        System.out.println("main() : x= " + d.x);
        change2(d);
        System.out.println("After change() ");
        System.out.println(d.x);
    }
}
