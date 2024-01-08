package cursoProgramacaoA30_A40_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicioCondicional07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2;

        System.out.println(" Valor1 :");
        valor1 = scanner.nextDouble();
        System.out.println(" Valor2 :");
        valor2 = scanner.nextDouble();

        if(valor1 == 0.0 && valor2 == 0.0){
            System.out.println("Origem");
        }
        else if (valor1 == 0.0) {
            System.out.println("Eixo y");
        }
        else if (valor2 == 0.0) {
            System.out.println("Eixo x");
        }
        else if (valor1 > 0.0 && valor2 > 0.0) {
            System.out.println("Q1");
        }
        else if (valor1 < 0.0 && valor2 > 0.0) {
            System.out.println("Q2");
        }
        else if (valor1 < 0.0 && valor2 < 0.0) {
            System.out.println("Q3");
        }
        else{
            System.out.println("Q4");
        }
        scanner.close();
    }

}
