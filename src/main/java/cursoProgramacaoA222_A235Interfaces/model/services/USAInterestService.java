package cursoProgramacaoA222_A235Interfaces.model.services;

<<<<<<< HEAD
=======
import java.security.InvalidParameterException;

>>>>>>> 75bcf63d32834bd26fc63547030cf3eda2383aff
public class USAInterestService implements InterestService {
    private double interestRate;

    public USAInterestService(double interestRate) {
        this.interestRate = interestRate;
    }
<<<<<<< HEAD

=======
>>>>>>> 75bcf63d32834bd26fc63547030cf3eda2383aff
    @Override
    public double getInterestRate() {
        return interestRate;
    }
<<<<<<< HEAD
=======
    @Override
    public double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + interestRate / 100.00, months);
    }
>>>>>>> 75bcf63d32834bd26fc63547030cf3eda2383aff
}
