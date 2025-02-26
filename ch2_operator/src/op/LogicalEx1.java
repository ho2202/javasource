package op;

public class LogicalEx1 {
    public static void main(String[] args) {
        int x = 12, y;
        System.out.printf("x=%2d, 10 < x < 20 = %b\n", x, 10 > x && x < 20 );
        y = 6;
        System.out.printf("y=%2d, y %% 2 == 0 || y %% 3 == 0 && 6 != 0 = %b\n", y, (y % 2 == 0 || y % 3 == 0) && y % 6 != 0 );
        
        char ch = '1';
        System.out.printf("ch= %c, '0' <= ch && ch <= '9' %b\n", ch, '0' <= ch && ch <= '9' );
        ch = 'a';
        System.out.printf("ch= %c, 'a' <= ch && ch <= 'z' %b\n", ch, 'a' <= ch && ch <= 'z' );
        
    }
}
