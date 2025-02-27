package condition;

import java.util.Scanner;

public class IfTest8 {
    public static void main(String[] args) {
        int rate = 9800; // 시간당 임금
        int pay, hours;

        // 근무시간 입력받아 hours에 저장
        // 8 >= hours 시간당 임금, 8시간 이후 hours 1.5배 임금
        Scanner scanner = new Scanner(System.in);
        System.out.print("근무시간 입력: ");
        String input = scanner.nextLine();
        hours = Integer.parseInt(input);
        
        if (hours > 8) {
            pay = (int)( 8 * rate + (hours - 8) * rate * 1.5);
        } else {
            pay = hours * rate;
        }
        
        if (hours < 0) {
            pay = 0;
        }
        System.out.printf("받을 임금: %d", pay);
        scanner.close();
    }
}
