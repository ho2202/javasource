package ch5_array.src.array;

import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int num, tmp;
        for (int i = 0; i < 6; i++) {
            num = (int) (45 * Math.random());
            tmp = ball[i];
            ball[i] = ball[num];
            ball[num] = tmp;
        }
        System.out.println(Arrays.toString(ball));
    }
}
