package pFuncionalLambda_1.application;

import pFuncionalLambda_1.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class mainComparator_4ExprressaoLambda {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Comparator<Product> comp = Comparator.comparing(p -> p.getName().toUpperCase());

        list.sort(comp);
        for (Product p : list) {
            System.out.println(p);
        }
    }
}

