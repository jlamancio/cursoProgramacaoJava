package cursoProgramacaoA84_A103ComportamentoMemoriaArrayLista;

import org.w3c.dom.ls.LSOutput;

public class mainBoxingUnboxing {
    public static void main(String[] args) {

        int x = 20;          // variável do tipo valor
        Object obj = x;      // variável do tipo  referência
        Integer obj1 = x;    // wrapper classe

        int y = (int) obj;   // unboxing
        int z = obj1;

        System.out.println(obj);
        System.out.println(obj1);

    }

}
