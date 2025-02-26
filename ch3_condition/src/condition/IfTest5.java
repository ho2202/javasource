package condition;

public class IfTest5 {
    public static void main(String[] args) throws Exception {
        int dice = (int)(Math.random() * 6 + 1);
        if(dice == 1 ){
            System.out.printf("주사위 %d번이 나왔습니다.",dice);
        } else if(dice == 2 ){
            System.out.printf("주사위 %d번이 나왔습니다.",dice);
        } else if(dice == 3 ){
            System.out.printf("주사위 %d번이 나왔습니다.",dice);
        } else if(dice == 4 ){
            System.out.printf("주사위 %d번이 나왔습니다.",dice);
        } else if(dice == 5 ){
            System.out.printf("주사위 %d번이 나왔습니다.",dice);
        } else if(dice >= 6 ){
            System.out.printf("주사위 %d번이 나왔습니다.",dice);
        }
    }
}
