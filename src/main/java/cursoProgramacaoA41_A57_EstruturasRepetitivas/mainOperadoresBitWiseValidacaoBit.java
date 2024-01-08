package cursoProgramacaoA41_A57_EstruturasRepetitivas;

import java.util.Scanner;

public class mainOperadoresBitWiseValidacaoBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int mascara = 32  => este número possui o 6º bit com valor zero
        int mascara = 0b00100000;    // o 'b' indica que é um binario
        int n = scanner.nextInt();

        if((n & mascara) != 0){
            System.out.println("verdadeiro");
        }
        else{
            System.out.println("falso");
        }
        scanner.close();
    }
}
