package src.exception;

public class LoginEx {
    public static void main(String[] args) {
        try {
            login("white", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void login(String id, String pwd) throws Exception {
        if (!id.equals("blue")) {
            throw new Exception("아이디가 없음");
        }
        if (!pwd.equals("12")) {
            throw new Exception("비밀번호 틀림");
        }
    }
}
