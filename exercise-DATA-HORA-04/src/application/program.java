package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class program {
    public static void main(String[] args) {


        // Data-Hora +/- tempo -> Data-Hora

        LocalDate date01 = LocalDate.parse("2025-02-18");
        LocalDateTime date02 = LocalDateTime.parse("2025-02-18T01:30:26");
        Instant date03 = Instant.parse("2025-02-18T01:30:26Z");

        LocalDate pastWeek = date01.minusDays(7);
        LocalDate nextWeek = date01.plusDays(7);

        System.out.println("Semana Passada = " + pastWeek);
        System.out.println("Proxima Semana = " + nextWeek);

        System.out.println();

        LocalDateTime pastWeekTime = date02.minusDays(7);
        LocalDateTime nextWeekTime = date02.plusDays(7);

        System.out.println("Semana Passada = " + pastWeekTime);
        System.out.println("Proxima Semana = " + nextWeekTime);

        Instant pastWeekInstant = date03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = date03.plus(7, ChronoUnit.DAYS);

        System.out.println("Semana Passada = " + pastWeekInstant);
        System.out.println("Proxima Semana = " + nextWeekInstant);

        //Data-Hora 1, Data-Hora2 -> Duração

        Duration t1 = Duration.between(pastWeek.atStartOfDay(), date01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekTime, date02);
        Duration t3 = Duration.between(nextWeekTime, date03);

        System.out.println("t1 Dias = " + t1.toDays() + " Dias.");
        System.out.println("t2 dias = " + t2.toDays() + " Dias.");
        System.out.println("t3 dias = " + t3.toDays() + " Dias.");

    }
}
