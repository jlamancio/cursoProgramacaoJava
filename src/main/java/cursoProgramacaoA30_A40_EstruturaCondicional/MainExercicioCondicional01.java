package cursoProgramacaoA30_A40_EstruturaCondicional;

import java.util.Scanner;

public class MainExercicioCondicional01 {
    public static void main(String[] args) {
        /*
         Objetivo: ler um número X e verificar se é negativo ou positivo
         */

        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número : ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O número " + numero + " é negativo !!");
        } else {
            System.out.println("O número " + numero + " é positivo !!");
        }
        sc.close();

    }
}
