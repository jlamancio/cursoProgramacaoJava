package cursoProgramacaoA30_A40_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicioCondicional06 {

    public static void main(String[] args) {

        double numero;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número : ");
        numero = scanner.nextDouble();

        if (numero < 0.00 || numero > 100){
            System.out.println("Fora do Intervalo");
        }
        else if (numero <= 25.00) {
            System.out.println("Intervalo [00,25]");
        } 
        else if (numero <= 50.00 ) {
            System.out.println("Intervalo [25,50]");
        }
        else if (numero <= 75.00 ) {
            System.out.println("Intervalo [50,75]");
        }
        else {
            System.out.println("Intervalo [75,100]");
        }
        scanner.close();
    }

}
