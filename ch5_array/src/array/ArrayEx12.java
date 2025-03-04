package ch5_array.src.array;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String names[] = { "Kim", "Park", "Yi" };
        String name[] = new String[2]; // [null, null]

        int arr1[] = new int[2]; // [0, 0]
        boolean arr2[] = new boolean[2]; // [false, false]
        System.out.println(Arrays.toString(arr1) + Arrays.toString(arr2));
        // String : null
    }
}
