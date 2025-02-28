package loop;

public class ForEx10 {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i < num + 1; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i < num + 1; i++) {
            for (int j = num; j > 0; j--) {
                if (j > i) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            for (int j = 2; j < num + 1; j--) {
                if (j > i) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}