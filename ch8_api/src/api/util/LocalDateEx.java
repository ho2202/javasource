package api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate date = LocalDate.now();
        // System.out.println(date);
        System.out.println("연도: " + date.getYear());
        System.out.println("월: " + date.getMonthValue());
        System.out.println("일: " + date.getDayOfMonth());

        LocalTime time = LocalTime.now();
        System.out.println(time.getHour() + "시");
        System.out.println(time.getMinute() + "분");
        System.out.println(time.getSecond() + "초");

        System.out.println("+5일: " + date.plusDays(5));
        System.out.println("-5달: " + date.minusMonths(5));
    }
}