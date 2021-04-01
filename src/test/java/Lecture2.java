import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Lecture2 {


    @Test
    @DisplayName("Parsing Test1")
    void parsingTest() {
        String year = "2021";
        String month = "04";
        //String month = Month.APRIL;
        String date = "01";
        String today = year + month  + date;

        DateTimeFormatter dateTimeFormatter = null;
        try {
            dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            LocalDate parse = LocalDate.parse(today, dateTimeFormatter);
            LocalDate pars1 = LocalDate.parse("20220401", dateTimeFormatter);


        } catch (DateTimeException e) {
            e.printStackTrace();
        }

    }

    @Test
    @DisplayName("Parsing Test2")
    void parsingTest2() {

        LocalDateTime localDateTime = null;
        try {
            localDateTime = LocalDateTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            String format = dateTimeFormatter.format(localDateTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    @Test
    @DisplayName("Parsing Test3")
    void parsingTest3() {

        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatter dateTimeFormatter = dateTimeFormatterBuilder
                .appendLiteral("월:")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral("일:")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("시간:")
                .appendPattern("HH")
                .appendLiteral(":")
                .appendValue(ChronoField.MINUTE_OF_HOUR)
                .toFormatter();

        LocalDateTime dateTime = LocalDateTime.now();
        String format = dateTime.format(dateTimeFormatter);
        System.out.println("format = " + format);

    }
}
