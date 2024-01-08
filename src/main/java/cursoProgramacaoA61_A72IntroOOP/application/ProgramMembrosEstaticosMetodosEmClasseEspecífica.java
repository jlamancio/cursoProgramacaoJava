package cursoProgramacaoA61_A72IntroOOP.application;

import cursoProgramacaoA61_A72IntroOOP.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMembrosEstaticosMetodosEmClasseEspecífica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator ();

        System.out.println("Entre com o valor do raio ...: ");
        double raio = scanner.nextDouble();
        double c = calculator.circunferencia(raio);
        double v = calculator.volume(raio);

        System.out.printf("Valor da circunferência  %.2f%n", c);
        System.out.printf("Valor do volume %.2f%n", v);
        System.out.printf("Valor do PI %.5f%n", calculator.PI);
        scanner.close();
    }

}
