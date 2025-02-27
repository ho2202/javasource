package loop;

public class ForEx3 {
    public static void main(String[] args) throws Exception {
        int sum =0;

        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println("1~10의 합: "+sum);

        System.out.println("1~100 까지 중 3의 배수: ");
        for (int i = 1; i < 101; i+=3) {
            if(i%3 == 0){
                System.out.print(i + "  ");
            }
        }

    }
}
