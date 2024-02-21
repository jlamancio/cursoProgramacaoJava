package pFuncional_Function.application;

import pFuncional_Function.entities.Product;
import pFuncional_Function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class mainProgramFunction_1 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());          // impplementação INTERFACE
        // List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());  // static method
        // List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); //
        // Function<Product, String> func = p -> p.getName().toUpperCase();              // expressão lambda declarada
        // List<String> names = list.stream().map(func).collect(Collectors.toList());
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());  // function lambda inline

        names.forEach(System.out::println);

    }



}
