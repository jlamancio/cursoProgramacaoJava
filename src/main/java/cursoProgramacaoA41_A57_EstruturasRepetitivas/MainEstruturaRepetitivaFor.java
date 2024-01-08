package cursoProgramacaoA41_A57_EstruturasRepetitivas;

import java.util.Scanner;

public class MainEstruturaRepetitivaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = scanner.nextInt(), soma = 0;

        for (int i = 0;  i < cont; i++){
            int x = scanner.nextInt();
            soma += x;
        }

        System.out.println(soma);

        scanner.close();
    }

}
