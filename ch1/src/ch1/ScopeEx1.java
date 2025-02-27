package ch1;

public class ScopeEx1 {
    public static void main(String[] args) {
        int a = 10;
        {
            int x = 10;
            System.out.println(x);
            System.out.println(a);
        }
        // System.out.println(x);
        System.out.println(a);

        if(a < 20){
            int sum = 0;
            System.out.println(sum);
        }
        for (int i = 0; i < args.length; i++) {
            
        } // System.out.println(i);
    }
}
