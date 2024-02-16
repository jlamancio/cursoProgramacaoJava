package cursoProgramacaoA222_A235Interfaces.application.program;


import cursoProgramacaoA222_A235Interfaces.model.services.BrazilInterestService;
import cursoProgramacaoA222_A235Interfaces.model.services.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class mainDefaultMethods {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        BrazilInterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);
        System.out.println();
        System.out.println("Payment after " + months + "months : ");
        System.out.println(String.format("%.2f", payment));
        USAInterestService is1 = new USAInterestService(1.0);
        double payment1 = is1.payment(amount, months);
        System.out.println("Payment after " + months + " months : ");
        System.out.println(String.format("%.2f", payment1));

        sc.close();

    }
}
