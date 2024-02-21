package progFuncionalLambda_2;

import progFuncionalLambda_1.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class mainProgram_2 {

    /*
        Neste exercício estamos tratando do conceito de: FUNÇÃOO DE 1ª ORDEM; caso em que a
        função pode ser chamada e passada como argumento de outra função.
     */
    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.sort(mainProgram_2 ::compareProducts);
        list.forEach(System.out::println);
    }

}
