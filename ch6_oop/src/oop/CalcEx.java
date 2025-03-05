package oop;

public class CalcEx {
    public static void main(String[] args) {
        Calc calc = new Calc();
        long result;
        double result2;
        long num1 = 45, num2 = 15;

        result = calc.add(num1, num2);
        System.out.printf("%d + %d = %d\n", num1, num2, result);

        result = calc.sub(num1, num2);
        System.out.printf("%d - %d = %d\n", num1, num2, result);

        result = calc.mul(num1, num2);
        System.out.printf("%d * %d = %d\n", num1, num2, result);

        result2 = calc.div(num1, num2);
        System.out.printf("%d / %d = %.2f\n", num1, num2, result2);

        result = calc.max(num1, num2);
        System.out.printf("더 큰 숫자-> " + result);
    }
}
