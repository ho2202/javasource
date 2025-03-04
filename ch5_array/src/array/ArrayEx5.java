package ch5_array.src.array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        char ch[] = { 'a', 'b', 'c', 'd', 'e' };
        // 배열 길이
        System.out.println(ch.length);

        System.out.println(ch);
        System.out.println(Arrays.toString(ch));

        ch[2] = 'f';
        System.out.println(Arrays.toString(ch));

        double doubleArr[] = new double[5];
        // 주소 비슷한 값
        System.out.println(doubleArr);
        System.out.println(Arrays.toString(doubleArr));

    }
}
