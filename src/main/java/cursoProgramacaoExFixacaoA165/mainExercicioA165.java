package cursoProgramacaoExFixacaoA165;

import cursoProgramacaoExFixacaoA165.entities.Contribuinte;
import cursoProgramacaoExFixacaoA165.entities.PessoaFisica;
import cursoProgramacaoExFixacaoA165.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class mainExercicioA165 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o numero de contribuintes para o cálculo : ");
        int nContribuintes = scanner.nextInt();

        List<Contribuinte> list = new ArrayList<>();

        for (int i = 1; i <= nContribuintes; i++) {

            System.out.print("Informe os dados do Contribuinte #" + i + " :");
            System.out.print("Contribuinte Pessoa Física (f) ou Jurídica (j) ? ");
            char c = scanner.next().charAt(0);
            System.out.print("Nome do Contribuinte : ");
            String nome = scanner.next();
            System.out.print("Renda anual do Contribuinte : ");
            Double rendaAnual = scanner.nextDouble();

            if (c == 'f') {
                System.out.print("Entre com o valor das despesas médicas :");
                Double despesasMedicas = scanner.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, despesasMedicas));
            } else {
                System.out.print("Entre com o número de empregados :");
                Integer numeroDeEmpregados = scanner.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, numeroDeEmpregados));
            }
        }

        System.out.println();
        System.out.println("Total de Imposto pago por contribuinte:");
        for (Contribuinte contribuinte : list)
            System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", contribuinte.taxa()));

        double soma = 0.00;

        for (Contribuinte contribuinte : list) {
            soma += contribuinte.taxa();
        }
        System.out.println("Total de impostos pagos :" + String.format("%.2f", soma));
        scanner.close();

    }
}
