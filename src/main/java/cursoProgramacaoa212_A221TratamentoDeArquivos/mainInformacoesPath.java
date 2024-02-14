package cursoProgramacaoa212_A221TratamentoDeArquivos;

import java.io.File;
import java.util.Scanner;

public class mainInformacoesPath {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = scanner.nextLine();
        File path = new File(strPath);

        System.out.println("getName :" + path.getName());
        System.out.println("getParent : " + path.getParent());
        System.out.println("getParent : " + path.getPath());
        scanner.close();
    }
}
