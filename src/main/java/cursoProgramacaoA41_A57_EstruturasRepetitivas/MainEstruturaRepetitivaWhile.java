package cursoProgramacaoA41_A57_EstruturasRepetitivas;

import java.util.Scanner;

public class MainEstruturaRepetitivaWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0, valor= scanner.nextInt();

        while (valor != 0){
            soma += valor;
            valor = scanner.nextInt();
        }

        System.out.println(soma);

        scanner.close();
    }
}
