package cursoProgramacaoA17_A29_Conceitos;


import java.util.Locale;
import java.util.Scanner;

public class MainExercicioEstrturaSequencialExercicio04 {
    public static void main(String[] args) {

        int matricula, horasTrabalhadasMes;
        double salarioPorHora, salarioLiquidoMensal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" *** CALCULO DE SALARIO MENSAL ***");
        System.out.println();
        System.out.println("Informar a matricula do Funcionario ........: ");
        matricula = sc.nextInt();
        System.out.println("Informar quantidade de horas trabalhadas ...: ");
        horasTrabalhadasMes = sc.nextInt();
        System.out.println("Informar o valor da hora trabalhada ........: ");
        salarioPorHora = sc.nextDouble();

        salarioLiquidoMensal = salarioPorHora * horasTrabalhadasMes;

        System.out.println("Matrícula do Funcionário .... : " + matricula);
        System.out.printf("Salário Mensal ............... : %.2f%n", salarioLiquidoMensal);

        sc.close();
    }
}

