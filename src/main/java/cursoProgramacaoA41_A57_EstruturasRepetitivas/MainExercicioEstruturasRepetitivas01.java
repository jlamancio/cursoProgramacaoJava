package cursoProgramacaoA41_A57_EstruturasRepetitivas;

import java.util.Scanner;

public class MainExercicioEstruturasRepetitivas01 {
    public static void main(String[] args) {
        /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida.
        Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
        Quando a senha for informada corretamente deve ser impressa a mensagem
        "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
         */

    Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a senha de acesso :");
        int senha = scanner.nextInt();

    while (senha != 2002){
        System.out.println("Senha inválida! Favor informar novamente a senha");
        senha = scanner.nextInt();
       }
        System.out.println("Senha correta , acesso liberado !");
    scanner.close();





    }

}
