package pFuncional_Predicate.application;


import pFuncional_Predicate.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class mainProgramPredicate_1 {
    /*
        Neste exemplo vamos criar 5 diferentes tipos de implementação:
            interface - método abstrato :  list.removeIf(new ProductPredicate());
            Interface - reference method com método estático
            Interface - reference method com método não estático
            Expressão Lambda Declarada
            Expressão Lambda Inline
     */

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

//        list.removeIf(p -> p.getPrice() >= 100.00);        // implementação lambda básica
//        list.removeIf(new ProductPredicate());             // implementação interface Predicate
//        list.removeIf(Product::staticProductPredicate);    // method reference (estático)
//        list.removeIf(Product::nonStaticProductPredicate); // method reference (não estático)
//        double min = 100.00;
//        Predicate<Product> pred = p -> p.getPrice() >= min; // expressão lambda declarada
//        list.removeIf(pred);
        list.removeIf(p -> p.getPrice() >= 100.00); // expressão lambda inline.

        for (Product p : list) {
            System.out.println(p);
        }
    }
}