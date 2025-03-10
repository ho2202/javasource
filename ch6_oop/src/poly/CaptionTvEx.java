package poly;

public class CaptionTvEx {
    public static void main(String[] args) {
        Tv2 tv = new CaptionTv();

        tv.channel = 10;
        tv.channelUp();
        System.out.println("현재 채널: " + tv.channel);

        CaptionTv ctv = (CaptionTv) tv;
        ctv.displayCaption("Hello");
        ctv.caption = true;
        ctv.displayCaption("Hello java");
    }
}
