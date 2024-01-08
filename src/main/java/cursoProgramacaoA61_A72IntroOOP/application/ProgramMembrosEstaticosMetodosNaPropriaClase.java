package cursoProgramacaoA61_A72IntroOOP.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMembrosEstaticosMetodosNaPropriaClase {
    public static double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor do raio ...: ");
        double raio = scanner.nextDouble();
        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Valor da circunferência  %.2f%n", c);
        System.out.printf("Valor do volume %.2f%n", v);
        System.out.printf("Valor do PI %.5f%n", PI);
        scanner.close();
    }

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
