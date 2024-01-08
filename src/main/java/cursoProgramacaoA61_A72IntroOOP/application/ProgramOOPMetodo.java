package cursoProgramacaoA61_A72IntroOOP.application;

import cursoProgramacaoA61_A72IntroOOP.entities.Product;


import java.util.Locale;
import java.util.Scanner;

public class ProgramOOPMetodo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println();
        System.out.println(" *****  Entre com os dados do produto ***** ");
        System.out.println();
        System.out.print("Entre com o nome do Produto .........:  ");
        product.name = scanner.nextLine();
        System.out.print("Entre com a quantidade do produto ...:  ");
        product.quantity = scanner.nextInt();
        System.out.print("Entre com o preço do produto ........:  ");
        product.price = scanner.nextDouble();
        System.out.println();
        System.out.println("Dados do produto em estoque : " + product);

        System.out.print("Entre com a quantidade adicional do produto...:  ");
        int quantity = scanner.nextInt();
        product.addproducts(quantity);
        System.out.println();
        System.out.println("Dados do produto em estoque : " + product);

        System.out.print("Entre com a quantidade de produtos a excluir...:  ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Dados do produto em estoque : " + product);


        scanner.close();

    }
}
