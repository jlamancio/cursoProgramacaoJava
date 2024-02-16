package cursoProgramacaoA222_A235Interfaces.model.services;

<<<<<<< HEAD
import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();
    default double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.00, months);
    }
=======
public interface InterestService {
    double getInterestRate();
    double payment(double amount, int months);
>>>>>>> 75bcf63d32834bd26fc63547030cf3eda2383aff
}
