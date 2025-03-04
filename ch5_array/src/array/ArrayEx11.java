package ch5_array.src.array;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int score[] = { 75, 87, 91, 33, 100, 55, 85 };

        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - 1 - i; j++) {
                if (score[j] > score[j + 1]) {
                    int tmp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(score));
    }
}
