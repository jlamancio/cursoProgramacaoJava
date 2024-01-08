package cursoProgramacaoA84_A103ComportamentoMemoriaArrayLista;

import java.util.Locale;
import java.util.Scanner;

public class mainVetores1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        double [] vetor = new double[numero];

        for (int i = 0; i < numero; i++){
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i < numero; i++){
            soma += vetor[i];
        }

        double mediaAltura = soma / numero;

        System.out.printf("O tamanho médio é : %.2f%n", mediaAltura);

        scanner.close();

    }
}
