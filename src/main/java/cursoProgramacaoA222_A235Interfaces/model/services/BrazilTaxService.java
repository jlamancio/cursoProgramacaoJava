package cursoProgramacaoA222_A235Interfaces.model.services;

public class BrazilTaxService implements TaxService{
    public double tax(double amount){
        if (amount < 101){
            return amount * 0.20;
        }
        return amount * 0.15;
    }
}
