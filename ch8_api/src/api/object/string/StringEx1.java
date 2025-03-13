package api.object.string;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = new String("안녕하세요");
        String str2 = new String("안녕하세요");
        String str4 = "안녕하세요";
        String str3 = "안녕하세요";
        char[] charr = { '안', '녕', '하', '세', '요' };
        String str5 = new String(charr);
        System.out.println(str5);
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

        System.out.println(str1.equals(str4));

        str1 = "";
        System.out.println(str1.length());
        str2 = null;
        System.out.println(str2.length());
    }
}
