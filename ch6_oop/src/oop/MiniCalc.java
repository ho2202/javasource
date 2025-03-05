package oop;

public class MiniCalc {
    static int k;
    int a, b;

    static void print() {
        // 타 메서드 호출 시 객체 생성 후 호출
    }

    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void excute() {
        double result = avg(7, 10);
        println("실행 결과: " + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }
}
