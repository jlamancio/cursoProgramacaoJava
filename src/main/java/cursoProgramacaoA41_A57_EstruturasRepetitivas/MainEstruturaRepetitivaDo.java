package cursoProgramacaoA41_A57_EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class MainEstruturaRepetitivaDo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

         char resp;

         do {
             System.out.print("Informe a temperatura em graus Celsius: ");
             double grausCelsius = scanner.nextDouble();
             double grausFahrenheit = (9.0 * grausCelsius) / 5.0 + 32;
             System.out.printf("Temperatura em Fahrenheit: %.1f%n", grausFahrenheit);
             System.out.print("Deseja repetir ? (s/n): ");
             resp = scanner.next().charAt(0);
         } while (resp != 'n');

        scanner.close();
    }
}
