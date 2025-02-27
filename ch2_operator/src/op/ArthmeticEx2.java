package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
        byte a = 10, b = 4;
        int c1 = a+b;
        byte c2 = (byte) (a+b);       
        System.out.println(c1 + c2);
        System.out.printf("%d + %d = %d\n", a,b, a+b);
        System.out.printf("%d - %d = %d\n", a,b, a-b);
        System.out.printf("%d * %d = %d\n", a,b, a*b);
        System.out.printf("%d / %d = %d\n", a,b, a/b);
        System.out.printf("%d / %f = %f\n", a,(float)b, a/(float)b);
    }
}