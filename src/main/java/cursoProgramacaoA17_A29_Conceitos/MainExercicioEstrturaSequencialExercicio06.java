package cursoProgramacaoA17_A29_Conceitos;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicioEstrturaSequencialExercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, _PI = 3.14159;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("  ****** CALCULO DE AREAS ******");
        System.out.println("Informe o valor de A ......: ");
        A = sc.nextDouble();
        System.out.println("Informe o valor de B ......: ");
        B = sc.nextDouble();
        System.out.println("Informe o valor de C ......: ");
        C = sc.nextDouble();

        triangulo = (A * C) / 2;           // (cateto (base) * cateto(altura) / 2
        circulo = _PI * Math.pow(C, 2);    // _PI * C ao quadrado
        trapezio = ((A + B) * C) / 2;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        System.out.printf("Triangulo ........: %.3f%n", triangulo);
        System.out.printf("Circulo ..........: %.3f%n", circulo);
        System.out.printf("Trapezio .........: %.3f%n", trapezio);
        System.out.printf("Quadrado .........: %.3f%n", quadrado);
        System.out.printf("Retangulo ........: %.3f%n", retangulo);


        sc.close();
    }
}

