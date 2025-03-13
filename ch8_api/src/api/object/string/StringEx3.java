package api.object.string;

public class StringEx3 {
    public static void main(String[] args) {
        String str = "Hello";
        str += " World";
        // concat
        String str2 = "안녕하세요";
        str2 = str2.concat(" 반갑습니다.");
        System.out.println(str2);

        System.out.println("특정 문자로 종료 여부 " + str2.endsWith("요"));
        System.out.println("특정 문자로 시작 여부 " + str2.startsWith("요"));
        // endsWith
        String file = "test.txt";
        if (file.endsWith(".png") || file.endsWith(".gif") || file.endsWith(".jpg")) {
            System.out.println("이미지 파일입니다.");
        } else {
            System.out.println("이미지가 아닙니다.");
        }
        // replace
        System.out.println("replace() " + str.replace("Hello", "안녕하세요"));
        str.replace("Hello", "안녕하세요");
        System.out.println(str);
        // replaceAll
        str2 = "helloollo";
        System.out.println(str2.replaceAll("ll", "LL"));
        // substring
        str2 = "api.object.string";
        System.out.println(str2.substring(10));
    }
}
