package cursoProgramacaoA236_A249GenericsSetMap.application;

import cursoProgramacaoA236_A249GenericsSetMap.services.PrintService;

import java.util.Scanner;

public class mainProgram_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        Integer x = (Integer) ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
