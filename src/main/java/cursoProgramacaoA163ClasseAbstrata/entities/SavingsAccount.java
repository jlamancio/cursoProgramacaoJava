package cursoProgramacaoA163ClasseAbstrata.entities;

import cursoProgramacaoA163ClasseAbstrata.entities.Account;

public final class SavingsAccount extends Account {

public Double interestRate;

    public SavingsAccount() {
        super();
    }
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balance += balance * interestRate;
    }
    @Override
    public void withDraw(Double amount) {
        balance -= amount;
    }
}
