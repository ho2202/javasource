package src.exception;

public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = new int[2];

        // try {
        // System.out.println(arr[2]);
        // int num = 100 / 0;
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("배열을 확인하세요");
        // } catch (ArithmeticException e) {
        // System.out.println("0으로 나눌 수 없음");
        // }
        try {
            System.out.println(arr[0]);
            int num = 100 / 0;
        } catch (Exception e) {
            System.out.println("배열을 확인하세요");
            System.out.println("0으로 나눌 수 없음");
        }
        try {
            System.out.println(arr[0]);
            int num = 100 / 1;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("오류");
        } finally {
            System.out.println("무조건 실행되는 코드");
        }
    }
}
