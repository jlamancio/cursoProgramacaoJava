package cursoProgramacaoA58_A60FuncoesStringSintaxe;

import java.util.Scanner;

public class mainFuncoesSintaxeExemplo {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner (System.in);
       
        System.out.println("Entre com três numeros :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Math.max(a,b));
        
        scanner.close();
    }
}
