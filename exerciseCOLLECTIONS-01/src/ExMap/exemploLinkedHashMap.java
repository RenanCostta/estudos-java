package ExMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class exemploLinkedHashMap {
    public static void main(String[] args) { exemploListaSimples(); }

    private static void exemploListaSimples() {

        System.out.println("****** Exemplo lista Simples ******");

        Map<Integer, String> lista = new LinkedHashMap<>();
        lista.put(1, "Paulo afonso");
        lista.put(2, "Rosana silva");
        lista.put(4, "Pamela Siqueira");
        lista.put(3, "Nicolas matheus");

        System.out.println(lista);
        System.out.println();
    }
}
