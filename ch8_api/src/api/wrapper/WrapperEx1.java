package api.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = 10;
        Long l = 1l;

        Integer.parseInt("12");
        System.out.println(i.toString());

        System.out.println("(5, 8) " + Integer.max(5, 8));
        System.out.println("(5, 8) " + Integer.min(5, 8));
    }
}
