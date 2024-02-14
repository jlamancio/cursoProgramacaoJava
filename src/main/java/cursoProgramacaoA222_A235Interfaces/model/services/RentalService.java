package cursoProgramacaoA222_A235Interfaces.model.services;

import cursoProgramacaoA222_A235Interfaces.model.entities.CarRental;
import cursoProgramacaoA222_A235Interfaces.model.entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }
    public void processInvoice(CarRental carRental){
        carRental.setInvoice(new Invoice(50.00, 10.00));
    }
}
