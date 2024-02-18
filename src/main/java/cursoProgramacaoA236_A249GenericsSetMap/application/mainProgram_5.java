package cursoProgramacaoA236_A249GenericsSetMap.application;

import java.util.Arrays;
import java.util.List;


public class mainProgram_5 {
    public static void main(String[] args) {
//
//        List<Object> myObjs = new ArrayList<Object>();
//        List<?> myObjs = new ArrayList<Object>();
//        List<Integer> myNumbers = new ArrayList<Integer>();
//        myObjs = myNumbers;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
        List<String> myStrs = Arrays.asList("Jose", "Luis", "Amancio", "Flavia", "Boconcelo");
        printList(myStrs);
    }
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
