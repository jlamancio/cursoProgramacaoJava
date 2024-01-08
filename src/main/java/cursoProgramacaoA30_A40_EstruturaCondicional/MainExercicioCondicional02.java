package cursoProgramacaoA30_A40_EstruturaCondicional;

import java.util.Scanner;

public class MainExercicioCondicional02 {
    public static void main(String[] args) {
        /*
         Objetivo: ler um número X e verificar se é par ou impar
         */

        int numero, resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número : ");
        numero = sc.nextInt();
        resultado = ( numero % 2 );

        if (resultado == 0) {
            System.out.println("O número " + numero + " é par !!");
        } else {
            System.out.println("O número " + numero + " é impar !!");
        }

        sc.close();

    }
}
