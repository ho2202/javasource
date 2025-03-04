package ch5_array.src.array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        int arr[] = { 78, 67, 56, 45, 23 };

        int tmp[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        System.out.println(Arrays.toString(tmp));

        System.arraycopy(arr, 0, tmp, 0, 0); // arraycopy(Object 원본배열, int 복사할 시작 위치, Object 새배열, int 새배열 위치, int 복사할개수)
                                             // : void
        int tmp2[] = new int[10];
        System.arraycopy(arr, 0, tmp2, 2, arr.length);
        System.out.println(Arrays.toString(tmp2));
        ;
    }
}
