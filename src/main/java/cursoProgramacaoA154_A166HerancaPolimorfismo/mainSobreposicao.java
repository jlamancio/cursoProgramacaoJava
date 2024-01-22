package cursoProgramacaoA154_A166HerancaPolimorfismo;

import cursoProgramacaoA154_A166HerancaPolimorfismo.entities.Account;
import cursoProgramacaoA154_A166HerancaPolimorfismo.entities.BusinessAccount;
import cursoProgramacaoA154_A166HerancaPolimorfismo.entities.SavingsAccount;

public class mainSobreposicao {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Jose", 1000.00 );
        acc1.withDraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00,0.10);
        acc2.withDraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Severino", 1000.00, 500.00);
        acc3.withDraw(200.00);
        System.out.println(acc3.getBalance());
    }
}
