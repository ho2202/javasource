package loop;

public class ForEx13 {
    public static void main(String[] args) {
        long s = 0, e = 0;
        s = System.currentTimeMillis();
        // for (int i = 2; i < 101; i++) {
        // int count = 0;
        // for (int j = 1; j <= i; j++) {
        // if (i % j == 0) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // System.out.print(i + "\t");
        // }
        // }
        e = System.currentTimeMillis();
        System.out.print(e - s);

        s = System.currentTimeMillis();
        for (int i = 2; i < 101; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + "\t");
            }
        }
        e = System.currentTimeMillis();
        System.out.print(e - s);

    }
}
