package set.application;

import set.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class mainProgramSetIgualdade {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product("Tv", 900.0));
        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Tablet", 400.00));

        Product prod = new Product("Notebook", 1200.00);

        System.out.println(set.contains(prod));

    }
}
