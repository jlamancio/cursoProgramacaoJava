package cursoProgramacaoA61_A72IntroOOP.application;

import cursoProgramacaoA61_A72IntroOOP.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramOOP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triangulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Entre com as medidas do triangulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Area do trinagulo X : %.4f%n", areaX);
        System.out.printf("Area do triangulo Y : %.4f%n", areaY);
        System.out.println();
        System.out.println("A maior área é : " + Math.max(areaX, areaY));


        scanner.close();

    }
}
