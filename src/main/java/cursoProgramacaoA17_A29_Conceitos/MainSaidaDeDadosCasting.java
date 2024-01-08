package cursoProgramacaoA17_A29_Conceitos;

public class MainSaidaDeDadosCasting {
    public static void main(String[] args) {     //* entry point da aplicação
      int a=5,b=2;
      double resultado;

      resultado = a/b;
           // resultado = a/b;
           resultado = (double) a/b;  // Casting

        System.out.println(resultado);

    }



}
