package cursoProgramacaoA163ClasseAbstrata;


import cursoProgramacaoA163ClasseAbstrata.entities.Account;
import cursoProgramacaoA163ClasseAbstrata.entities.BusinessAccount;
import cursoProgramacaoA163ClasseAbstrata.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class mainClasseAbstrata {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "jose", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Luis", 1000.00, 600.00));
        list.add(new SavingsAccount(1003, "Amancio", 300.00, 0.02));
        list.add(new BusinessAccount(1004, "Flavia", 500.00, 0.05));

        double sum = 0.00;

        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance : %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.00);
        }

        for (Account acc : list) {
            System.out.printf(" Updated  balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
