package cursoProgramacaoA167_A168TratamentoExececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainTratamentoExcecoesTryCatch_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] vetor = scanner.nextLine().split(" ");

            int posicao = scanner.nextInt();
            System.out.println(vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição do ítem selecionado é inválida");
        }
        catch (InputMismatchException e){
            System.out.println("Opção digitada é inválida");
        }
        System.out.println();
        System.out.println("FIM NORMAL DO PROGRAMA");

        scanner.close();
    }
}
