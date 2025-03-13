package src.exception;

public class CheckedEx1 {
    public static void main(String[] args) {
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            // 오류 발생 위치 알려줌
            e.printStackTrace();
        }
    }
}
