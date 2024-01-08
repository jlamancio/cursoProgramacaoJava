package cursoProgramacaoA58_A60FuncoesStringSintaxe;

public class mainFuncoesParaStringSintaxe {
    public static void main(String[] args) {
        String original = "abcde FGHIJH ABC abc DEFG     ";

        String s01 = original.toLowerCase();
        String s01a = original.toUpperCase();
        String s01b = original.trim();
        String s02 = original.substring(2);
        String s02a = original.substring(2,9);
        String s03 = original.replace('a','#');
        String s03a = original.replace("abc", "111");
        int inicio = original.indexOf("bc");
    //    int final = original.lastIndexOf(int "bc")  // esta função está dando erro


        System.out.println();
        System.out.println("Orginal: -" + original  + "-");
        System.out.println("toLowerCase " + s01);
        System.out.println();
        System.out.println("toUpperCase " + s01a);
        System.out.println();
        System.out.println("trim " + s01b);
        System.out.println();
        System.out.println("substring(2) " + s02);
        System.out.println();
        System.out.println("Substring(2,9) " + s02a);
        System.out.println();
        System.out.println("Substring(2,9) " + s03);
        System.out.println();
        System.out.println("Substring(2,9) " + s03a);
        System.out.println();
        System.out.println("Inicio " + inicio);


    }
}
