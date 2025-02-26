package op;

public class ConditionEx1 {
    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = -5;
        z = 0;
        
        int result1 = x >= 0 ? x : -x;

        char result2 = y > 0 ? 'A' : 'B' ;
        
        String result3 = z > 0 ? "A" : "B";
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
