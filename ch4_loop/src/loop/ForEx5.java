package loop;

public class ForEx5 {
    public static void main(String[] args) {
        int sum = 0;
        // 3의 배수의 합
        for (int i = 0; i < 101; i+=3) {
            sum += i;
        }
        System.out.println("1. "+sum);
        sum = 0;

        for (int i = 1; i < 101; i++) {
            if(i % 3==0){
            sum += i;}
        }
        System.out.println("1. "+sum);
        sum = 0;

        // 9의 배수는 아니고 3의 배수인 수 더한 합
        for (int i = 0; i < 101; i+=3) {
            if (i % 3 == 0 && i % 9 != 0) {
                sum += i;
            }
        }
        System.out.println("2. "+sum);
        sum = 0;

        // 3의 배수와 5의 배수 총합
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0) {
                sum += i;
            } else if(i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("3. "+sum);

    }
}
