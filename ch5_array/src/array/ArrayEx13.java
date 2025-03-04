package ch5_array.src.array;

public class ArrayEx13 {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];

        arr1[0][0] = 73;
        arr1[0][1] = 83;
        arr1[1][0] = 63;
        arr1[1][1] = 93;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] is : arr1) {
            for (int element : is) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int[] is : arr1) {
            for (int element : is) {
                sum = element;
            }
            System.out.println();
        }
    }
}
