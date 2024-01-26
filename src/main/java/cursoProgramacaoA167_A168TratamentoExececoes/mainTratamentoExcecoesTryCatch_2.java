package cursoProgramacaoA167_A168TratamentoExececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class mainTratamentoExcecoesTryCatch_2 {
    public static void main(String[] args) {

        metodo1();
        System.out.println();
        System.out.println("FIM NORMAL DO PROGRAMA");

    }
    public static void metodo1(){
        System.out.println(" **** inicio do metodo1 ***");
        metodo2();
        System.out.println(" **** final do metodo2 ***");
    }
    public static void  metodo2(){
        System.out.println(" **** inicio do metodo2 ***");

        Scanner scanner = new Scanner(System.in);
        try {
            String[] vetor = scanner.nextLine().split(" ");

            int posicao = scanner.nextInt();
            System.out.println(vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição do ítem selecionado é inválida");
            e.printStackTrace();
            scanner.next();
        }
        catch (InputMismatchException e){
            System.out.println("Opção digitada é inválida");
        }
        scanner.close();
        System.out.println(" **** final do metodo2 ***");
    }
}
