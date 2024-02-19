package cursoProgramacaoA236_A249GenericsSetMap.application;

import cursoProgramacaoA236_A249GenericsSetMap.entities.Circle;
import cursoProgramacaoA236_A249GenericsSetMap.entities.Rectangle;
import cursoProgramacaoA236_A249GenericsSetMap.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class mainProgram_7 {
    public static void main(String[] args) {

        // princípio get/ put => covariância

        Locale.setDefault(Locale.US);

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;
        Number x = list.get(0);                // é possível atribuir um tipo específico a uma lista
                                               // de tipo genérico (GET)

       // list.add(20);                          // não é possível adicionar itens mesmo que sejam nunéricos (PUT)
    }
}
