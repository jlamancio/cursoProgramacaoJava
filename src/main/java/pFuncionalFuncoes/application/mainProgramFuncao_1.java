package pFuncionalFuncoes.application;


import pFuncionalFuncoes.entities.Product;
import pFuncionalFuncoes.services.ProductService;

import java.util.ArrayList;
import java.util.List;


public class mainProgramFuncao_1 {
    /*
           Este exercício aborda como uma função pode receber outra função (do usuário (dev))
            como parâmetro.
     */
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}
