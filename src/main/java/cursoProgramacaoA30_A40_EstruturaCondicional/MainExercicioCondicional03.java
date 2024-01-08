package cursoProgramacaoA30_A40_EstruturaCondicional;

import java.util.Scanner;

public class MainExercicioCondicional03 {
    public static void main(String[] args) {
        /*
         Objetivo: ler dois números e definir se são múltiplos
         */

        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número : ");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo número : ");
        num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println(" Os numeros " + num1 + " e " + num2 + " são multiplos ");
        } else {
            System.out.println(" Os numeros " + num1 + " e " + num2 + " não são multiplos ");
        }
        sc.close();

    }
}
