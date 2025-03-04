package ch5_array.src.array;

public class ArrayEx8 {
    public static void main(String[] args) {
        int score[] = { 75, 87, 91, 33, 100, 55, 85 };
        int max = score[0], min = score[0];
        for (int i : score) {
            if (max < score[i]) {
                max = score[i];
            }
            if (min > score[i]) {
                min = score[i];
            }
        }
    }
}
