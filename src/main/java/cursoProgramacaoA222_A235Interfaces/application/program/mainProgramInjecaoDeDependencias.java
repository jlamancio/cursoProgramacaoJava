package cursoProgramacaoA222_A235Interfaces.application.program;

import cursoProgramacaoA222_A235Interfaces.model.entities.Contract;
import cursoProgramacaoA222_A235Interfaces.model.entities.Installment;
import cursoProgramacaoA222_A235Interfaces.model.services.ContractService;
import cursoProgramacaoA222_A235Interfaces.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class mainProgramInjecaoDeDependencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre com os dados do Contrato: ");
        System.out.print("Número do Contrato: ");
        int number = sc.nextInt();
        System.out.print("Data do contrato (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do Contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService( new PaypalService());
        contractService.processContract(obj, n);

        System.out.println(" *** P A R C E L A S *** ");
        for (Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }
        sc.close();
    }
}
