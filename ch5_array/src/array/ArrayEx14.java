package ch5_array.src.array;

public class ArrayEx14 {
    public static void main(String[] args) {
        int score[][] = {
                { 100, 78, 98 },
                { 76, 55, 74 },
                { 89, 78, 67 },
                { 56, 56, 58 }
        };

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("--------------------------------------");
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%3d  ", i + 1);
            int sum = 0;
            float avg;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.print(score[i][j] + "   ");
            }
            avg = (float) sum / score[i].length;
            System.out.printf(sum + "   %.2f\n", avg);

        }
        System.out.println("--------------------------------------");

        System.out.printf("총합: %d \t %d\t %d\n", korTotal, engTotal, mathTotal);
    }
}
