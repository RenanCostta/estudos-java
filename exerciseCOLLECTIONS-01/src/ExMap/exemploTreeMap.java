package ExMap;

import java.util.Map;
import java.util.TreeMap;
/*
 * Chave nunca se repete
 * Garante que as chaves estarão em ordem ascendente
 * pode ser retirado do mapa por chave
 *
 */
public class exemploTreeMap {
    public static void main(String[] args) {

        exemploListaSimples();
    }

    private static void exemploListaSimples() {

        System.out.println("****** Exemplo lista Simples ******");

        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Paulo afonso");
        lista.put(2, "Rosana silva");
        lista.put(3, "Pamela siqueira");
        lista.put(4, "Nicolas matheus");
        lista.put(5, "Renan silva");

        System.out.println(lista);
        System.out.println();

        lista.remove(3);

        System.out.println(lista);
    }
}
