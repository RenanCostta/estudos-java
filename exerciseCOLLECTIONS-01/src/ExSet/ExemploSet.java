package ExSet;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();

    }

    private static void exemploNovo() {
        System.out.println("****** Exemplo Novo ******");

        Set<Integer> listaInteiros = new HashSet<>();
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);
        listaInteiros.add(3);
        // Não existe duplicações do dados

        System.out.println(listaInteiros);

    }

    public static void exemploListaSimples() {
        System.out.println("****** ExemploListaSimples ******");

        Set<String> lista = new HashSet<String>();

        lista.add("Rosana silva");
        lista.add("Renan silva");
        lista.add("Renan silva");
        lista.add("Paulo afonso");
        lista.add("Nicolas matheus");
        lista.add("Pamela Siqueira");
        lista.add("Bernardo menegatti");
        lista.add("Henry silva");

        System.out.println(lista);
        System.out.println("");

    }


    public static void exemploListaSimplesOrdemAscendente() {

        System.out.println("******* Lista simples ordem ascendente ******");

        Set<String> lista2 = new HashSet<String>();
        lista2.add("Rosana silva");
        lista2.add("Renan silva");
        lista2.add("Paulo afonso");
        lista2.add("Nicolas matheus");
        lista2.add("Pamela Siqueira");
        lista2.add("Bernardo menegatti");
        lista2.add("Henry silva");

        System.out.println(lista2);
        System.out.println("");
    }
}