package pFuncionalLambda_1.application;

import pFuncionalLambda_1.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainComparator_1 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Collections.sort(list);

        System.out.println();
        for(Product p : list){
            System.out.println(p);
        }
    }
}
