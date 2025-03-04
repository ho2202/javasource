package ch5_array.src.array;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        String[][] words = {
                { "chair", "의자" },
                { "computer", "컴퓨터" },
                { "integer", "정수" }
        };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("%d. %s의 뜻은? ", i + 1, words[i][0]);
            String answer = sc.nextLine();

            if (words[i][1].equals(answer)) {
                System.out.println("정답");
            } else {
                System.out.println("틀렸습니다. 정답은 " + words[i][1] + "입니다.");
            }
        }
        sc.close();
    }
}
