package Day4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;


public class lesDatesTimes {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        /// 2 Manipulating

        String localDateTime = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDateTime);
//
//        Period period = Period.between(ld, LocalDate.from(localDateTime));
//        System.out.println(localDateTime.getDayOfWeek());
        Duration duration = Duration.of(10, ChronoUnit.SECONDS);

        System.out.println(duration);


        // 3 Formatting
        LocalDate localTime = LocalDate.now();
        System.out.println(ld.format(DateTimeFormatter.ISO_LOCAL_DATE));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(localTime.format(dateTimeFormatter));
        System.out.println(dateTimeFormatter.format(localTime));


        // Pattern
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(localTime.format(dateTimeFormatter1));
        System.out.println(dateTimeFormatter.format(localTime));

    }
}
