package cursoProgramacaoA17_A29_Conceitos;


import java.util.Locale;
import java.util.Scanner;

public class MainExercicioEstrturaSequencialExercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, resultado, PI = 3.14159;

        System.out.println(" **** CALCULO DO RAIO DA CIRCUNFERÊNCIA ****");
        System.out.println();
        System.out.println("Informe o raio da circurnferência:");
        raio = sc.nextDouble();
        resultado = PI * Math.pow(raio, 2.0d);

        System.out.println(resultado);

        sc.close();

    }
}
