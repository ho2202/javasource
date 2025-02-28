package loop;

public class BreakEx2 {
    public static void main(String[] args) {
        int num = 0;

        while (true) {
            num = (int) (Math.random() * 6) + 1;
            System.out.println("주사위: " + num);

            if (num == 6)
                break;
        }
    }
}
