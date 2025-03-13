package api.object.string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {

        String str = "안녕하세요";
        System.out.println("길이 " + str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4));

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        char[] charr = new char[5];

        for (int i = 0; i < charr.length; i++) {
            charr[i] = str.charAt(i);
        }
        System.out.println("charr: " + Arrays.toString(charr));
        charr = str.toCharArray();
        System.out.println("주어진 문자가 문자열에 존재하는가 " + str.indexOf("하"));
        System.out.println(str.contains("안"));

        String subject = "자바의 정석";
        System.out.println(subject.indexOf("자바"));

        if (subject.indexOf("자바") >= 0) {
            System.out.println("자바와 관련 있는 책입니다");
        } else {
            System.out.println("자바와 관련 없는 책입니다");
        }
        if (subject.contains("자바")) {
            System.out.println("자바와 관련 있는 책입니다");
        } else {
            System.out.println("자바와 관련 없는 책입니다");
        }
        System.out.println(str.lastIndexOf(str));
    }
}
