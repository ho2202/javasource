package oop;

public class MiniCalcEx {
    public static void main(String[] args) {
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        MiniCalc calc = new MiniCalc();
        calc.excute();

        calc.a = 1;
    }
}