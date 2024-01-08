package cursoProgramacaoA17_A29_Conceitos;

import java.util.Locale;
import java.util.Scanner;

public class MainEntradaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(" DADOS DIGITADOS ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();


//        String s1, s2, s3;
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        s3 = sc.nextLine();
//
//        System.out.println(" DADOS DIGITADOS ");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);


//        String texto;
//        int numeroInteiro;
//        double numeroPontoFlutuante;
//        char caracter;
//
//        texto = sc.next();    // leitura de string;
//        numeroInteiro = sc.nextInt();
//        numeroPontoFlutuante = sc.nextDouble();
//        caracter = sc.next().charAt(0);
//        System.out.println("Voce digitou : " + texto);
//        System.out.println("Voce digitou : " + numeroInteiro);
//        System.out.println("Voce digitou : " + numeroPontoFlutuante);
//        System.out.println("Voce digitou : " + caracter);

        sc.close();
    }
}
