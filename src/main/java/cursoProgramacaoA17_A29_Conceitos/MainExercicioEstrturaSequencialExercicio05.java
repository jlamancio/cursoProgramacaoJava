package cursoProgramacaoA17_A29_Conceitos;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicioEstrturaSequencialExercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cdpc1, cdpc2, qtdpc1, qtdpc2;
        double valpc1, valpc2,valTotalPcs;

        System.out.println( " **** CONTROLE DE VENDA DE PEÇAS **** ");
        System.out.println();
        System.out.println("Informe o código da peça 1 .....: ");
        cdpc1 = sc.nextInt();
        System.out.println("Informe a quantidade da peça 1 .: ");
        qtdpc1 = sc.nextInt();
        System.out.println("Informe o valor da peça 1 ......: ");
        valpc1 = sc.nextDouble();
        System.out.println();
        System.out.println("Informe o código da peça 2 .....: ");
        cdpc2 = sc.nextInt();
        System.out.println("Informe a quantidade da peça 2 .: ");
        qtdpc2 = sc.nextInt();
        System.out.println("Informe o valor da peça 2 ......: ");
        valpc2 = sc.nextDouble();
        valTotalPcs = ((qtdpc1 * valpc1) + (qtdpc2 * valpc2));
        System.out.println();
        System.out.printf("O valor tota da compra e %.2f%n", valTotalPcs);

        sc.close();
    }
}

