package cursoProgramacaoA61_A72IntroOOP.application;

import cursoProgramacaoA61_A72IntroOOP.util.Calculator;
import cursoProgramacaoA61_A72IntroOOP.util.CalculatorEstatic;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMembrosEstaticosMetodosMetodosEstaticos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor do raio ...: ");
        double raio = scanner.nextDouble();
        double c = CalculatorEstatic.circunferencia(raio);
        double v = CalculatorEstatic.volume(raio);

        System.out.printf("Valor da circunferência  %.2f%n", c);
        System.out.printf("Valor do volume %.2f%n", v);
        System.out.printf("Valor do PI %.5f%n", CalculatorEstatic.PI);
        scanner.close();
    }

}
