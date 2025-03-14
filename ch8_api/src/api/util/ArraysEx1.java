package api.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {
    public static void main(String[] args) {

        Integer[] arr = { 22, 33, 43, 32, 1, 32 };
        // System.out.println(arr);
        System.out.println("배열 값 " + Arrays.toString(arr));
        Arrays.sort(arr);
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("정렬 후 " + Arrays.toString(arr));

        Character[] characters = { 'a', 'b', 'a', 'v' };
        Arrays.sort(characters);
        System.out.println(Arrays.toString(characters));
    }
}
