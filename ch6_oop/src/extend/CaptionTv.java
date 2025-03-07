package extend;

public class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String t) {
        if (caption) {
            System.out.println(t);
        }
    }
}
