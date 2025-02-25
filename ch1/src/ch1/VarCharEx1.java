package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        char ch1 = '기';
        char ch2 = 'a';
        char ch3 = 'A';

        int unicode = ch1;
        System.out.println("ch1 = " + ch1);
        System.out.println("unicode = "+ unicode);

        unicode = ch2;
        System.out.println("ch2 = " + ch2);
        System.out.printf("unicode = %c\n", unicode);
        
        System.out.println(String.valueOf(ch2 - ch3) );
        System.out.println(Integer.toString(65) );

    }
}
