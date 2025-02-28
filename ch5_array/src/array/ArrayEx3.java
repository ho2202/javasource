package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번째 학생의 점수 입력 >> ", i + 1);
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double av = sum / (double) arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println("합: " + sum + ", 평균: " + av);
    }
}
