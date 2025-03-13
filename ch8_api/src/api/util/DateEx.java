package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyyy-MM-dd E요일 a hh:mm:ss");

        System.out.println(df.format(d));
    }
}
