package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class program {
    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate date01 = LocalDate.now();
        LocalDateTime date02 = LocalDateTime.now();
        Instant date03 = Instant.now();

        LocalDate date04 = LocalDate.parse("2022-07-20");
        LocalDateTime date05 = LocalDateTime.parse("2022-07-20T10:30:27");
        Instant date06 = Instant.parse("2022-07-20T10:30:27Z");
        Instant date07 = Instant.parse("2022-07-20T10:30:27-03:00");

        LocalDate date08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime date09 = LocalDateTime.parse("20/07/2022 15:30", fmt2);

        //ao invés de criar uma variável para o dateformatter, podemos formatar tudo na mesma linha
        LocalDateTime date10 = LocalDateTime.parse("20/07/2022 18:40:27", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        LocalDate date11 = LocalDate.of(2022, 7, 20);
        LocalDateTime date12 = LocalDateTime.of(2022, 7, 20, 15, 30, 27);


        System.out.println("date01 = " + date01);
        System.out.println("date02 = " + date02);
        System.out.println("date03 = " + date03);
        System.out.println("date04 = " + date04);
        System.out.println("date05 = " + date05);
        System.out.println("date07 = " + date07);
        System.out.println("date06 = " + date06);
        System.out.println("date08 = " + date08);
        System.out.println("date09 = " + date09);
        System.out.println("date10 = " + date10);
        System.out.println("date11 = " + date11);
        System.out.println("date12 = " + date12);

    }
}
