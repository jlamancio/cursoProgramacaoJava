package pFuncionalLambda_2;

import pFuncionalLambda_1.entities.Product;

public class mainProgram_3 {

    /*
        Neste exercício estamos tratando do conceito de: CONCISÃO DO CÓDIGO; caso em que a
        função pode ser chamada e passada como argumento de outra função.
     */
    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {

        // programacao impeerativa
//
//        Integer sum = 0;
//        for (Integer x : list){
//            sum += x:
//        }
//
//        // programacao funcional
//        Integer sum = list.stream().reduce(0, Integer::sum);
//


    }

}
