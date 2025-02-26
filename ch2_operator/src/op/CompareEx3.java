package op;

public class CompareEx3 {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "abc";
        String str2 = new String("abc");
        
        System.out.printf("str1 == str2 %b\n", (str == str1)); // true
        System.out.printf("str1 == str3 %b\n", (str == str2)); // false
        System.out.printf("str1.equals(\"Abc\") %b\n", (str.equals("Abc") )); // false
        System.out.printf("str1.equalsIgnoreCase(str3) %b\n", (str.equalsIgnoreCase(str2) )); // true
        System.out.printf("str1.equalsIgnoreCase(\"Abc\") %b\n", (str.equalsIgnoreCase("Abc") )); // true
    }
}
