package cursoProgramacaoA30_A40_EstruturaCondicional;

import java.util.Scanner;

public class MainExercicioCondicional05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        int qtde = scanner.nextInt();
        double total;

        if (codigo == 1) {
            total = qtde * 4.00;
        } else if (codigo == 2) {
            total = qtde * 4.50;
        } else if (codigo == 3) {
            total = qtde * 5.00;
        } else if (codigo == 4) {
            total = qtde * 2.00;
        } else {
            total = qtde * 1.00;
        }

        System.out.println(total);

        scanner.close();
    }

}
