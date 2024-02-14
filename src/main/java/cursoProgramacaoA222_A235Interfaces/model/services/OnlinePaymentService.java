package cursoProgramacaoA222_A235Interfaces.model.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);

}
