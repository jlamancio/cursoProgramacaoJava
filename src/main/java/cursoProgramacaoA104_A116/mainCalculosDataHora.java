package cursoProgramacaoA104_A116;

import java.time.*;
import java.time.temporal.*;

public class mainCalculosDataHora {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2024-01-03");
        LocalDateTime d02 = LocalDateTime.parse("2024-01-03T19:08:15");
        Instant d03 = Instant.parse("2024-01-03T19:09:15Z");

        LocalDate semanaPassadaLocalDate = d01.minusDays(7);
        LocalDate mesPassadoLocalDate = d01.minusMonths(2);
        LocalDateTime horaAnteriorLocalDateTime = d02.minusHours(2);
        Instant semanaPassada = d03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemana = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("d01 = " + semanaPassadaLocalDate);
        System.out.println("d01 = " + mesPassadoLocalDate);
        System.out.println("d02 = " + horaAnteriorLocalDateTime);
        System.out.println();
        System.out.println("Instant - semana passada : " + semanaPassada);
        System.out.println("instant - próxima semana : " + proximaSemana);

        //d01 = d04
        //d02 = d05
        //d03 = d06

        // Calculo de duração

        Duration t1 = Duration.between(mesPassadoLocalDate.atTime(0,0),d01.atTime(0,0));
        Duration t2 = Duration.between(mesPassadoLocalDate.atStartOfDay(),d01.atStartOfDay());

        System.out.println();
        System.out.println("t1 = " + t1.toDays());
        System.out.println("t2 = " + t2.toDays());


    }
}
