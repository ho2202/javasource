package src.exception;

public class ThrowEx {
    public static void main(String[] args) {
        try {
            throw new Exception("고의 발생 오류");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
