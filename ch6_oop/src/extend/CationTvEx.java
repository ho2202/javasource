package extend;

public class CationTvEx {
    public static void main(String[] args) {
        CaptionTv captionTv = new CaptionTv();

        // Tv tv = new Tv();

        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.println("현재 채널: " + captionTv.channel);
        captionTv.displayCaption("Hello");
        captionTv.caption = true;
        captionTv.displayCaption("Hello java");
    }
}
