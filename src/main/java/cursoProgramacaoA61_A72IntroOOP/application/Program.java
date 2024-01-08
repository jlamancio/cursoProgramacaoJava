package cursoProgramacaoA61_A72IntroOOP.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as medidas do triangulo X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();
        System.out.println("Entre com as medidas do triangulo Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Area do trinagulo X : %.4f%n", areaX);
        System.out.printf("Area do triangulo Y : %.4f%n", areaY);
        System.out.println();
        System.out.println("A maior área é : " + Math.max(areaX, areaY));


        scanner.close();

    }
}
