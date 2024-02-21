package pFuncionalLambda_2;

import java.util.Arrays;

public class mainProgram_1 {

    /*
        Neste exercício estamos tratando do conceito de: TRANSPARENCIA REFERENCIAL; caso em que a
        função não depende de dados externos , como por exemplo:
        public static int globalValue = 3;
     */
    public static int globalValue = 3;

    public static void main(String[] args) {

        int[] vect = new int[]{3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }
    public static void changeOddValues(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                numbers[i] += globalValue;
            }
        }
    }


}
