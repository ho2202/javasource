package oop;

public class Calc {
    long add(long num1, long num2) {
        return num1 + num2;
    }

    long sub(long num1, long num2) {
        return num1 - num2;
    }

    long mul(long num1, long num2) {
        return num1 * num2;
    }

    double div(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    long max(long num1, long num2) {
        return num1 < num2 ? num2 : num1;

    }

    long min(long num1, long num2) {
        return num1 > num2 ? num2 : num1;

    }

}
