package ch5_array.src.array;

public class ArrayEx15 {
    public static void main(String[] args) {
        int[][] score = new int[3][];
        score[0] = new int[4];
        score[1] = new int[2];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println(score[i][j] + '\t');
            }
            System.out.println();
        }
    }
}
