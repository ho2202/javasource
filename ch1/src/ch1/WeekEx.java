package ch1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekEx {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());
        Week today = null;

        switch (dayOfWeek.getValue()) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WEDNSDAY;
                break;
            case 4:
                today = Week.THURSDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            case 7:
                today = Week.SUNDAY;
            default:
                break;
        }
        System.out.println("오늘은 " + today);
        if (today == Week.SUNDAY) {
            System.out.println();
        } else {
            System.out.println();
        }
    }
}
