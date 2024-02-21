package set.application;

import set.entities.Product;

import java.util.*;

public class mainProgramSetCompare {
    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>();
        set.add(new Product("Tv", 900.0));
        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Tablet", 400.00));

      for (Product p : set){
          System.out.println(p);
      }
    }
}
