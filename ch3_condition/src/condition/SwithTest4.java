package condition;
import java.util.Scanner;

public class SwithTest4 {
    public static void main(String[] args) {
        // 가위1, 바위2, 보3
        int num = (int)(Math.random()* 3 + 1);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1(가위), 2(바위), 3(보) 중에서 입력: ");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);

        switch (user) {
            case 1:
                switch (num) {
                    case 1:
                        System.out.println("비겼습니다.");
                        break;
                    case 2:
                        System.out.println("컴퓨터가 이겼습니다.");
                        break;
                    case 3: 
                        System.out.println("user가 이겼습니다.");
                        break;
                }
                break;
            case 2:
                switch (num) {
                    case 1:
                        System.out.println("컴퓨터가 이겼습니다.");
                        break;
                    case 2:
                        System.out.println("비겼습니다.");
                        break;
                    case 3: 
                        System.out.println("user가 이겼습니다.");
                        break;
                }
            case 3:
                switch (num) {
                    case 1:
                        System.out.println("컴퓨터가 이겼습니다.");
                        break;
                    case 2:
                        System.out.println("user가 이겼습니다.");
                        break;
                    case 3: 
                        System.out.println("비겼습니다.");
                        break;
                }
            default:
                break;
        }
        scanner.close();
    }
}
