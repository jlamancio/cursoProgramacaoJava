package cursoProgramacaoA104_116;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class mainConverteDatahoratexto {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2024-01-03");
        LocalDateTime d02 = LocalDateTime.parse("2024-01-03T06:12:35");
        Instant d03 = Instant.parse("2024-01-03T06:13:30Z");

        //https;//docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("Valor da data D01 : " + d01.format(fmt1));
        System.out.println("Valor da data D01 : " + fmt1.format(d01));
        System.out.println("Valor da data D01 : " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Valor da data D02 : " + d02.format(fmt2));
        System.out.println("Valor da data D02 : " + fmt2.format(d02));
        System.out.println("Valor da data D02 : " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        System.out.println("Valor da data D03 : " + fmt3.format(d03));


    }



}
