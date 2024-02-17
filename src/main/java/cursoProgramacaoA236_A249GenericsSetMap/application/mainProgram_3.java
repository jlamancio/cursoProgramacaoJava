package cursoProgramacaoA236_A249GenericsSetMap.application;

import cursoProgramacaoA236_A249GenericsSetMap.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainProgram_3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        String path = "c:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }
            Integer x = CalculationService.max(list);
            System.out.println("Max: " + x);

        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
