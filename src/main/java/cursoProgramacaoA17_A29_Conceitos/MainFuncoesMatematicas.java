package cursoProgramacaoA17_A29_Conceitos;

import java.util.Locale;

public class MainFuncoesMatematicas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de  25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(7, 3);

        System.out.println("Raiz quadrada : " + A);
        System.out.println("Raiz quadrada : " + B);
        System.out.println("Raiz quadrada : " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Numero absoluto: " + A);
        System.out.println("Numero absoluto: " + B);

    }
}
