package cursoProgramacaoA222_A235Interfaces.application.program;

import cursoProgramacaoA222_A235Interfaces.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainComparableInterface {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "c:\\temp\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            System.out.println();
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Erro ao tentar manipular o arquivo: " + e.getMessage());
        }
    }
}


