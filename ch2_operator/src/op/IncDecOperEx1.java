package op;

public class IncDecOperEx1 {
    public static void main(String[] args) {
        int num = 10;
        num = num +1;
        System.out.println(num);

        num = 10;
        num++;
        System.out.println("num = " + num);

        num = 10;
        num--;
        System.out.println("num = " + num);

        num = 10;
        System.out.println("num = " + --num);
    }
}
