package cursoProgramacaoA154_A166HerancaPolimorfismo;

import cursoProgramacaoA154_A166HerancaPolimorfismo.entities.Account;
import cursoProgramacaoA154_A166HerancaPolimorfismo.entities.SavingsAccount;

import java.util.Locale;

public class mainPolimorfismo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Account x = new Account(1020, "Jose", 1000.00);
        Account y = new SavingsAccount(1023, "Maria", 1000.00, 0.01);

        x.withDraw(50.00);
        y.withDraw(50.00);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
