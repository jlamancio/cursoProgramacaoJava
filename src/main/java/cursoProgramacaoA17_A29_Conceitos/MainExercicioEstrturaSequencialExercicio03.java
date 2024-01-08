package cursoProgramacaoA17_A29_Conceitos;


import java.util.Scanner;

public class MainExercicioEstrturaSequencialExercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int var1, var2, var3, var4;

        System.out.println(" **** ENTRE COM 4 NUMEROS **** ");

        var1 = sc.nextInt();
        var2 = sc.nextInt();
        var3 = sc.nextInt();
        var4 = sc.nextInt();

        System.out.println("A diferença do produto dos números informados eh : " + ((var1 * var2) - (var3 * var4)));


        sc.close();

    }

}
