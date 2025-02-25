package ch1;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        System.out.println("d = "+ d);
        int score = (int)d;
        System.out.println("score = "+ score );

        int intValue = 10;
        double dblValue = 5.5;
        int result = intValue + (int)dblValue;
        System.out.printf("result = %d\n", result);

        float f1 = 9.12f;
        double d1 = 9.12345678;
        double d2 = f1, result2 = d1 + f1;

        int num = 98;
        char ch1 = (char)num;
        System.out.println(ch1);
        System.out.println(d2 + "" + result2);
    }
}
