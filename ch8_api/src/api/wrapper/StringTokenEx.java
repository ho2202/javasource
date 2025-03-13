package api.wrapper;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        String str = "This is a test";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(Arrays.toString(str.split(" ")));

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t"); // 개별 문자열로 리턴
        }
        System.out.println();

        str = "This/is/a/test";
        st = new StringTokenizer(str, "/");
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        String ex = "x=100+(200+300)";
        st = new StringTokenizer(ex, "+-*/=()", true);
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        String source = "1.김천재,100,100,100|2.박수재,95,100,90|3.이범재,80,90,80";
        st = new StringTokenizer(source, "|");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            StringTokenizer st2 = new StringTokenizer(token, ",.");
            while (st2.hasMoreTokens()) {
                System.out.println(st2.nextToken());
            }
            System.out.println("-----------------------------");
        }
        System.out.println();
    }
}
