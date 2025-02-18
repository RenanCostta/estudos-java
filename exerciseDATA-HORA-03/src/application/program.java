package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class program {
    public static void main(String[] args) {


        LocalDate date01 = LocalDate.parse("2025-02-18");
        LocalDateTime date02 = LocalDateTime.now();
        Instant date03 = Instant.parse("2025-02-18T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(date03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(date03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(date03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(date03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("date01 dia = " + date01.getDayOfMonth());
        System.out.println("date01 mês = " + date01.getMonthValue());
        System.out.println("date01 ano = " + date01.getYear());

        System.out.println("date02 hora = " + date02.getHour());
        System.out.println("date02 minuto = " + date02.getMinute());
        System.out.println("date02 segundo = " + date02.getSecond());


    }
}
