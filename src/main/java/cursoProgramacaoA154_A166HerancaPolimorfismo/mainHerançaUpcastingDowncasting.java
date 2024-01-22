package cursoProgramacaoA154_A166HerancaPolimorfismo;

import cursoProgramacaoA154_A166HerancaPolimorfismo.entities.Account;
import cursoProgramacaoA154_A166HerancaPolimorfismo.entities.BusinessAccount;
import cursoProgramacaoA154_A166HerancaPolimorfismo.entities.SavingsAccount;

import java.util.Locale;

public class mainHerançaUpcastingDowncasting {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bsacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UPCASTING

                Account acc1 = bsacc;
                Account acc2 = new BusinessAccount(1003, "José", 0.0, 550.00);
                Account acc3 = new SavingsAccount(1004, "Antonio", 0.0, 0.01);

        //DOWNCASTING

                BusinessAccount acc4 = (BusinessAccount) acc2;
                acc4.loan(100.0);
        //        BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(50.00);
            System.out.println("Emprestimo!");
        }
        if (acc3 instanceof SavingsAccount){
             SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
