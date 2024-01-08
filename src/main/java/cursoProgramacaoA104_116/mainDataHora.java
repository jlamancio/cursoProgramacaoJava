package cursoProgramacaoA104_116;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class mainDataHora {
    public static void main(String[] args) {
        // instanciaçao de data-hora local e global

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataLocal = LocalDate.now();
        LocalDateTime dataHoraLocal = LocalDateTime.now();
        Instant dataHoraGlobal = Instant.now();
        LocalDate dataLocal1 = LocalDate.parse("2024-01-01");
        LocalDateTime dataHoraLocal1 = LocalDateTime.parse("2024-01-01T03:30:26");
        Instant dataHoraGlobal1 = Instant.parse("2025-01-01T01:00:03Z");
        Instant dataHoraGlobal2 = Instant.parse("2025-01-01T01:00:03-03:00");
        LocalDate dataLocal2 = LocalDate.parse("01/01/2024", format);
        LocalDate dataLocal3 = LocalDate.of(2024, 1, 1);
        LocalDateTime dataHoraLocal2 = LocalDateTime.of(2024,01,01, 1, 30);

        /*
            Por padrão no JAVA quando executa o comando PRINTLN ; o variável concatenada e exibida
            utilizando o método toString.
            Formato padrão ISO8601
         */


        System.out.println();
        System.out.println(dataLocal);
        System.out.println();
        System.out.println(dataHoraLocal);
        System.out.println();
        System.out.println(dataHoraGlobal);
        System.out.println();
        System.out.println(dataLocal1);
        System.out.println();
        System.out.println(dataHoraLocal1.toString());
        System.out.println();
        System.out.println(dataHoraGlobal1);
        System.out.println();
        System.out.println(dataHoraGlobal2);
        System.out.println();
        System.out.println(dataLocal2);
        System.out.println();
        System.out.println(dataLocal3);
        System.out.println();
        System.out.println(dataHoraLocal2);
    }
}
