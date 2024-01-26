package cursoProgramacaoA167_A168TratamentoExececoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mainTratamentoExcecoesTryCatchFinally_3 {
    public static void main(String[] args) {

        File file = new File("C:\\Desenvolvimento\\in.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Erro na abertura do arquivo: " + e.getMessage());
        }
        finally {
            if (scanner != null){
                scanner.close();
            }
            System.out.println();
            System.out.println("Passou no bloco finally");
        }
    }
}
