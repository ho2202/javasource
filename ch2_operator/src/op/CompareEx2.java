package op;

public class CompareEx2 {
    public static void main(String[] args) {
        float f1 = 0.1f;
        double d1 = 0.1f;
        double d2 = (double)f1;

        System.out.printf("10 == 10.0f \t %b \n", (10==10.0f) );
        System.out.printf("0.1 == 0.1f \t %b \n", (0.1 ==0.1f) );
        System.out.printf("f1 == %19.17f \n", 1f);
        System.out.printf("d1 == %19.17f\n", d1);
        System.out.printf("d2 == %19.17f\n", d2);
        System.out.printf("f1 == d1 %b\n", f1==d1);
        System.out.printf("d1 == d2 %b\n", d1==d2);
        System.out.printf("d2 == f1 %b\n", d2==f1);
        System.out.printf("(float)d1 == f1 %b\n", (float)d1==f1);
        
        System.out.println();
    }
}