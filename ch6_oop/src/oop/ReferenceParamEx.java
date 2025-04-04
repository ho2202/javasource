package oop;

public class ReferenceParamEx {
    public static void main(String[] args) {
        // 주소 복사
        int[] x = { 10 };
        System.out.println("main(): x = " + x[0]);
        change(x);
        System.out.println("After change(x)");
        System.out.println("main(): x = " + x[0]);
    }

    static void change(int[] x) {
        x[0] = 1000;
        System.out.println("change(): x = " + x[0]);

    }

    static void change2(int x) {
        x = 100;
        System.out.println("change2(): x = " + x);
    }
}
