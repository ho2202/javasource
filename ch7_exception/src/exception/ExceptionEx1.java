package src.exception;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int number = 180;
        int result = 50;
        try {
            for (int i = 0; i < 10; i++) {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 불가");
        } catch (Exception e) {
            System.out.println("오류 발생");
        }

    }
}