package src.exception;

import java.util.Scanner;

public class NumberFormatEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 >> ");
        try {

            int num = Integer.parseInt(sc.nextLine());
            System.out.println(num);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("숫자만 입력하세요");
        }
        try {
            int num[] = new int[2];
            System.out.println(num[2]);
        } finally {
            System.out.println("무조건 실행문");
            sc.close();
        }

    }
}
