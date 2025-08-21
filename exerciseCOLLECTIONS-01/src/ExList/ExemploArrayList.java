package ExList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    public static void exemploListaSimples() {
        System.out.println("******** Exemplo lista simples ********");

        List<String> lista = new ArrayList<String>();
        lista.add("Renan silva");
        lista.add("Rosana silva");
        lista.add("Paulo afonso");
        lista.add("Pamela siqueira");
        lista.add("Nicolas matheus");
        System.out.println(lista);
        System.out.println();

    }

    public static void exemploListaSimplesOrdemAscendente() {
        System.out.println("******** Exemplo lista ordem ascendente ********");

        List<String> lista = new ArrayList<>();
        lista.add("Renan silva");
        lista.add("Rosana silva");
        lista.add("Paulo afonso");
        lista.add("Pamela siqueira");
        lista.add("Nicolas matheus");
        Collections.sort(lista);
        System.out.println(lista);


    }
}
