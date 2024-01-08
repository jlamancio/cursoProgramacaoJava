package cursoProgramacaoA30_A40_EstruturaCondicional;

import java.util.Scanner;

public class MainExercicioCondicional04 {
    public static void main(String[] args) {
        /*
            Objetivo: Calcular o tempo de duração de um jogo qualquer dados
                      o horário de inicio e fim da partida
            Regras .:
                      A partida pode iniciar em um dia e terminar no outro
                      A partida não pode ter duração superior a 24 horas.
        */

        int horaInicio, horaFim, totalHoras;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o horário de inicio da partida : ");
        horaInicio = sc.nextInt();
        System.out.println("Informe o horario do final da partida : ");
        horaFim = sc.nextInt();

        if (horaInicio < horaFim){
            totalHoras = horaFim - horaInicio;
        }
        else {
            totalHoras = 24 - horaInicio + horaFim;
        }
        System.out.println("O jogo durou : " + totalHoras);

        sc.close();
    }
}
