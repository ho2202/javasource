package poly;

public class CaptionTv extends Tv2 {
    boolean caption;

    void displayCaption(String t) {
        if (caption) {
            System.out.println(t);
        }
    }
}
