package cursoProgramacaoA236_A249GenericsSetMap.application;

import cursoProgramacaoA236_A249GenericsSetMap.entities.Product;
import cursoProgramacaoA236_A249GenericsSetMap.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class mainProgram_4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println();
            System.out.println("Max: " + x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
