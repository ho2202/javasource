package op;

public class ArthmeticEx3 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int result = c1 + 1;
        c3 = (char)(c1 + 1);
        c2++;
        c2++;

        System.out.println("c1 = "+ c1);
        System.out.println("result = "+ result);
        System.out.println("c2 = "+ (int)c2);
        System.out.println("c3 = "+ c3);
    }
}