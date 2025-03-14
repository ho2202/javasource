package api.util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        Integer[] arr = { 22, 33, 43, 32, 1, 32 };
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 22));
        Integer[] arr1 = { 22, 33, 43, 32, 4, 32 };
        Integer[] arr2 = { 22, 33, 43, 32, 4, 32 };

        System.out.println(Arrays.equals(arr2, arr1));
    }
}
