import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.*;

public class Lecture1 {

    @Test
    @DisplayName("LocalDate Test")
    void localDateTest(){

        //현재 시간
        LocalDate  present = LocalDate.now();

        //과거 날짜
        LocalDate past = LocalDate.of(2019, Month.APRIL, 1);

        // withYear 이용해서 년 정도 변
        LocalDate pastChangeTime = past.withYear(2020);

        //날짜 비교 after
        boolean after = present.isAfter(past);

        //날짜 비교 before
        boolean before = present.isBefore(past);

        //날짜 비교 equal
        boolean equals = present.equals(past);

    }

    @Test
    @DisplayName("MonthDay Test")
    void monthDayTest() {

        MonthDay monthDay = MonthDay.now();
        System.out.println("monthDay = " + monthDay);

        int monthValue = monthDay.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        int dayOfMonth = monthDay.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);

        Month month = monthDay.getMonth();
        System.out.println("month = " + month);

        MonthDay monthDay1 = MonthDay.of(Month.FEBRUARY, 21);
        System.out.println("monthDay1 = " + monthDay1);
    }


    @Test
    @DisplayName("yearMonth Test")
    void yearMonthTest() {

        YearMonth yearMonth = YearMonth.now();
        System.out.println("yearMonth = " + yearMonth);

        YearMonth yearMonth1 = yearMonth.plusMonths(1);
        System.out.println("plus one Month = " + yearMonth1);

        YearMonth yearMonth2 = yearMonth.plusYears(1);
        System.out.println("plus one Year = " + yearMonth2);
        System.out.println("yearMonth2.lengthOfMonth() = " + yearMonth2.lengthOfMonth());
        System.out.println("yearMonth2.lengthOfYear() = " + yearMonth2.lengthOfYear());
        System.out.println("yearMonth2..getMonth() = " + yearMonth2.getMonth());
        System.out.println("yearMonth2.getYear() = " + yearMonth2.getYear());
        System.out.println("yearMonth2.getMonthValue() = " + yearMonth2.getMonthValue());
        System.out.println("yearMonth2.atEndOfMonth() = " + yearMonth2.atEndOfMonth());

    }

    @Test
    @DisplayName("LocalTime Test")
    void localTimeTest(){

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getMinute() = " + localTime.getMinute());
        System.out.println("localTime.getSecond() = " + localTime.getSecond());
        System.out.println("localTime.getNano() = " + localTime.getNano());


    }

    @Test
    @DisplayName("LocalDateTime Test")
    void localDateTimeTest(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime.getYear() = " + localDateTime.getYear());
        System.out.println("localDateTime.getMonth() = " + localDateTime.getMonth());
        System.out.println("localDateTime.getMonthValue() = " + localDateTime.getMonthValue());
        System.out.println("localDateTime.getDayOfMonth() = " + localDateTime.getDayOfMonth());
        System.out.println("localDateTime.getDayOfYear() = " + localDateTime.getDayOfYear());
        System.out.println("localDateTime.getDayOfWeek() = " + localDateTime.getDayOfWeek());
        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getSecond() = " + localDateTime.getSecond());

    }
}
