package oop;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        System.out.println(math.add(1, 2));
        System.out.println(math.add(2002000L, 110));
        int b[] = { 1, 2, 4, 5 };
        System.out.println(math.add(b));
    }
}
