package cursoProgramacaoA222_A235Interfaces.model.services;

import java.security.InvalidParameterException;


public class USAInterestService implements InterestService {
    private double interestRate;

    public USAInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + interestRate / 100.00, months);
    }

}
