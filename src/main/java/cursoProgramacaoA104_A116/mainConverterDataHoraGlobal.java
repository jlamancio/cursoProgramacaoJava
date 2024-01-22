package cursoProgramacaoA104_A116;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class mainConverterDataHoraGlobal {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2024-01-03");
        LocalDateTime d02 = LocalDateTime.parse("2024-01-03T19:08:15");
        Instant d03 = Instant.parse("2024-01-03T19:09:15Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println(d03);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println(d01.getDayOfMonth());
        System.out.println(d01.getDayOfWeek());
        System.out.println(d01.getDayOfYear());




       for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }

    }
}
