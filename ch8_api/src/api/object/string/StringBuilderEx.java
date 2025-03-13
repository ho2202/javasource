package api.object.string;

public class StringBuilderEx {
    public static void main(String[] args) {
        String str1 = "안녕하세요"; // 메모리 할당
        str1 += " 반갑습니다"; // 메모리 재할당
        str1 += " "; // 메모리 재할당

        // StringBuffer sb = "";
        StringBuffer sb = new StringBuffer("안녕하세요");
        sb.append(" 반갑습니다");
        sb.append(" ");

        sb.append(" 반갑습니다").append(" 반갑습니다");

        String str2 = new String("Hello");
        String str3 = new String("Hello");
        // System.out.println(str2.equals(str3) ? "같은 문자열" : "다른 문자열");

        // equals 메소드를 상속된 그대로 사용함
        StringBuffer sb2 = new StringBuffer("Hello");
        StringBuffer sb3 = new StringBuffer("Hello");
        // System.out.println(sb2.equals(sb3) ? "같은 문자열" : "다른 문자열");

        // String으로 변환
        // String obj1 = sb2.toString();
        // String obj2 = sb3.toString();
        String obj1 = new String(sb2);
        String obj2 = new String(sb3);
        System.out.println(obj1.equals(obj2) ? "같은 문자열" : "다른 문자열");

        for (int i = str1.length() - 1; i > -1; i--) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        System.out.println(sb2.reverse());

        // delete, insert
        System.out.println(sb3.delete(0, 2));
        System.out.println(sb3.deleteCharAt(0));
        System.out.println(sb3.insert(0, "H"));

        System.out.println(sb3.replace(0, 2, "java"));
        System.out.println(sb3);
    }
}
