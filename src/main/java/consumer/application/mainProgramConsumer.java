package consumer.application;


import consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;


public class mainProgramConsumer {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

//        list.forEach(new PriceUpdate());      // função para incrementar valor
//        list.forEach(System.out::println);
//        list.forEach(Product::staticPriceUpdate); // reference method - static
//        list.forEach(System.out::println);
//        list.forEach(Product::nonStaticPriceUpdate); // reference method - non static
//        list.forEach(System.out::println);
//        double factor = 1.1;
//        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
//
//        list.forEach(cons); // Expressão lambda declarada
//        list.forEach(System.out::println);

          double factor = 1.1;
          list.forEach(p -> p.setPrice(p.getPrice() * factor)); // Expressão lambda inline
          list.forEach(System.out::println);
    }
}
