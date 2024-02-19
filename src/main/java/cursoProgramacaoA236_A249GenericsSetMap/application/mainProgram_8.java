package cursoProgramacaoA236_A249GenericsSetMap.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class mainProgram_8 {
    public static void main(String[] args) {

        // princípio get/ put => contravariância

        Locale.setDefault(Locale.US);

        // é permitido o PUT de tipos diferentes

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("José");
        myObjs.add("Luis");

        List<? super Number> myNumbs = myObjs;
        myNumbs.add(10);
        myNumbs.add(5);

      //  Number x = myNumbs.get(0);          // GET - irá gerar um erro de compilação;
    }
}
