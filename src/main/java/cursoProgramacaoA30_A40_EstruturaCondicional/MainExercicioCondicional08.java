package cursoProgramacaoA30_A40_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicioCondicional08 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor do salário : ");
        double salarioBruto = scanner.nextDouble();
        double imposto = 0.00;

        if (salarioBruto < 0.00){
            System.out.println("Salário inválido");
        }
        else if (salarioBruto <= 2000.00) {
            System.out.println("Salario isento de impostos");
            imposto = 0.0;
        }
        else if (salarioBruto <= 3000.00) {
            System.out.println("Salário tributado em 8%");
            imposto = (salarioBruto - 2000.0) * 0.08;
        }
        else if (salarioBruto <= 4500.00) {
            System.out.println("Salario tributado em 18%");
            imposto = (salarioBruto - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else{
            System.out.println("Salário tributado em 28%");
            imposto = (salarioBruto - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        System.out.printf("Valor do imposto em R$: %.2f%n", imposto);

        scanner.close();
    }

}
