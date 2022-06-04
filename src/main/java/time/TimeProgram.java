package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeProgram {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat dateFormat
                = new SimpleDateFormat(
                        "yyyy-MM-dd HH:mm:ss YY");
        System.out.println("java.util.Date: " + dateFormat.format(date));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(LocalDateTime.now(ZoneId.of("UTC")));

        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy:MM:dd");

        DateTimeFormatter formatter2
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(localDate.format(formatter));
        System.out.println(localDateTime.format(formatter2));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate specifiedLocalDate =
                LocalDate.of(2022, 1, 1);
        System.out.println(specifiedLocalDate.format(formatter));
    }
}
