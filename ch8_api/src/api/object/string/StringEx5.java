package api.object.string;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println("AB문자열 횟수: " + count("1234AB567ABAB890", "AB"));
        System.out.println("AB문자열 횟수: " + count("12345", "AB"));
    }

    public static int count(String src, String target) {
        int c = 0, pos = 0;

        while ((pos = src.indexOf(target, pos)) != -1) {
            c++;
            pos += target.length();
        }
        return c;
    }
}
