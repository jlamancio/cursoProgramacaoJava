package cursoProgramacaoa212_A221TratamentoDeArquivos;

import java.io.File;
import java.util.Scanner;

public class mainManipulandoPastas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o caminho para a pasta : ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("PASTAS");
        System.out.println();
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS");
        for (File file : files){
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\novaPasta").mkdir();
        System.out.println("Diretório criado com sucesso: " + sucess);

        scanner.close();
    }
}
