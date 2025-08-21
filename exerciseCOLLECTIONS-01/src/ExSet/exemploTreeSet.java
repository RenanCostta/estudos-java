package ExSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class exemploTreeSet {
    public static void main(String[] args) {
        exemploListaSimplesTreeSet();

    }

    private static void exemploListaSimplesTreeSet() {
        System.out.println("******* exemplo lista simples Tree Set *******");

        Set<String> lista = new TreeSet<String>();

        lista.add("Paulo afonso");
        lista.add("Rosana silva");
        lista.add("Pamela siqueira");
        lista.add("Nicolas matheus");
        lista.add("Renan silva");
        lista.add("Bernardo menegatti");
        lista.add("Henry silva");


        System.out.println(lista);
        System.out.println();
    }
}
