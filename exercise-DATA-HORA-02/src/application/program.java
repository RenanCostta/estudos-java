package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class program {
    public static void main(String[] args) {

        LocalDate date04 = LocalDate.parse("2022-07-20");
        LocalDateTime date05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant date06 = Instant.parse("2022-07-20T01:30:26Z");

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());


        System.out.println("date04 = " + date04);
        System.out.println("date04 = " + date04.format(fmt01)); //ou sout("date04" + fmt01.format(d04));
        System.out.println();
        System.out.println("date05 = " + date05);
        System.out.println("date05 = " + date05.format(fmt01));
        System.out.println("date05 = " + date05.format(fmt02));
        System.out.println();
        System.out.println("date06 = " + date06);
        System.out.println("date06 = " + fmt03.format(date06));


    }
}
