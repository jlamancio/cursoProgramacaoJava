package cursoProgramacaoA84_A103ComportamentoMemoriaArrayLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mainListas1 {

    public static void main(String[] args) {

        /*
            Uma lista não aceita tipos primitivos, é necessário utilizar uma WRAPPER class;
            Um objeto do tipo interface (LIST) lista não pode ser instanciado; para isso, é preciso instanciar
            uma classe que IMPLEMENTE uma INTERFACE. A classe Arraylist , é uma implementação otimizada, ou seja,
            é uma implementação com as características positivas do VETOR e da LISTA.
         */

        List<String> lista = new ArrayList<>();
        lista.add("Maria");
        lista.add("Bob");
        lista.add("Alex");
        lista.add("Anna");
        lista.add(2, "Josefina");
        System.out.println();
        System.out.println(lista.size());
        System.out.println();
        // lista.remove("Anna");
        // lista.remove(4);
        lista.removeIf(x -> x.charAt(0) == 'A');   // expressão LAMBDA
        System.out.println(lista.indexOf("Maria"));
        for (String conteudo : lista) {
            System.out.println(conteudo);
        }

        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        System.out.println();
        System.out.println("----------------------------------------------------------");
        for (String conteudo : resultado) {
            System.out.println(conteudo);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");
        String nome = lista.stream().filter(x-> x.charAt(0) == 'T').findFirst().orElse(null);
        for (String conteudo : resultado) {
            System.out.println(conteudo);
        }

    }
}
