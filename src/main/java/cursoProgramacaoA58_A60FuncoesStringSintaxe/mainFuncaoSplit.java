package cursoProgramacaoA58_A60FuncoesStringSintaxe;

public class mainFuncaoSplit {
    public static void main(String[] args) {
        String s = "batata limão maça";
        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
