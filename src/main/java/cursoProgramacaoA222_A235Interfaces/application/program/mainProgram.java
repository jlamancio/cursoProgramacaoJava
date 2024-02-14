package cursoProgramacaoA222_A235Interfaces.application.program;


import cursoProgramacaoA222_A235Interfaces.model.entities.CarRental;
import cursoProgramacaoA222_A235Interfaces.model.entities.Vehicle;
import cursoProgramacaoA222_A235Interfaces.model.services.BrazilTaxService;
import cursoProgramacaoA222_A235Interfaces.model.services.RentalService;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro : ");
        String modeloDoCarro = sc.nextLine();
        System.out.print("Retirada do veículo (dd/mm/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno do veículo (dd/mm/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(modeloDoCarro));

        System.out.println("Entre com o preço por hora:  ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println(" ***  F A T U R A  *** ");
        System.out.println();
        System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
