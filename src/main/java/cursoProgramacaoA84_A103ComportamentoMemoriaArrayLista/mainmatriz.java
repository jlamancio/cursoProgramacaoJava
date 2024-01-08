package cursoProgramacaoA84_A103ComportamentoMemoriaArrayLista;

import java.util.Locale;
import java.util.Scanner;

public class mainmatriz {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][] matriz = new int[n][n];

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Diagonal principal :");
        for (int i=0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int cont = 0;
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                if(matriz[i][j] < 0){
                    cont ++;
                }
            }
        }

        System.out.print("Numeros negativos :  " + cont);


        scanner.close();
    }
}
