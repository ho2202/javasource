package loop;

public class ForEx2 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + "   ");
        }
        System.out.println();

        for (int i = 1; i < 11; i+=2) {
            if (i % 2 == 0) {
                System.out.print(i + "   ");
            }
        }
        System.out.println();

        for (int i = 1; i < 6; i++) {
            System.out.print(i * 2 + "   ");
        }
        System.out.println();
    }
}
