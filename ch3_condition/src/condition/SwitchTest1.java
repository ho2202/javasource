package condition;

public class SwitchTest1 {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 6) + 1;
        switch (num) {
            case 1:
                System.out.printf("주사위 %d번이 나왔습니다.", num);
                break;
            case 2:
                System.out.printf("주사위 %d번이 나왔습니다.", num);
                break;
            case 3:
                System.out.printf("주사위 %d번이 나왔습니다.", num);
                break;
            case 4:
                System.out.printf("주사위 %d번이 나왔습니다.", num);
                break;
            case 5:
                System.out.printf("주사위 %d번이 나왔습니다.", num);
                break;
            case 6:
                System.out.printf("주사위 %d번이 나왔습니다.", num);
                break;
            default:
                break;
        }
    }
}
