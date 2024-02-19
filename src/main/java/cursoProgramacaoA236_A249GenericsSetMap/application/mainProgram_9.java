package cursoProgramacaoA236_A249GenericsSetMap.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class mainProgram_9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.27);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        copy(myDoubles, myObjs);
    }

    public static void copy(List<? extends Number> source,List<? super Number> target){
       for(Number number : source){
           target.add(number);
           System.out.println(number);
       }
    }
}
