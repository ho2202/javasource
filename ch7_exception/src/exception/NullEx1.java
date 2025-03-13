package src.exception;

public class NullEx1 {
    public static void main(String[] args) {
        String str = null;
        // str.length();
        Account accounts[] = new Account[5];

        try {
            for (Account account : accounts) {
                // account.get가 null이면 account가 null임
                System.out.println(account.getAno());
            }
        } catch (NullPointerException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("입력을 확인");
        }
    }
}
