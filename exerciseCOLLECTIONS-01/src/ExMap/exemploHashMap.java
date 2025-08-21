package ExMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Permite chaves e valores null.
* não existe garantia que os dados ficarão ordenados.
*
* Para usar uma classe que implementa Map, quaisquer classes
que forem utilizadas como chave devem sobrescrever os métodos
HashCode() e equals()
*/
public class exemploHashMap {
    public static void main(String[] args) {

        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
        exemploListaSimplesIterandoChaveValor();

    }

    private static void exemploListaSimples() {
        System.out.println("****** exemplo Lista Simples ******");

        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Renan silva");
        lista.put(3, "Nicolas matheus");
        lista.put(2, "Pamela siqueira");
        lista.put(4, "Rosana silva");
        lista.put(5, "Paulo afonso");

        System.out.println(lista);
        System.out.println();

    }

    private static void exemploListaSimplesIterandoValores() {

        System.out.println("****** exemplo lista iterando valores ****");

        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Paulo Afonso");
        lista.put(2, "Rosana silva");
        lista.put(3, "Pamela siqueira");
        lista.put(4, "Nicolas matheus");
        lista.put(5, "Renan silva");

        for (String value : lista.values()) {
            System.out.println(value);
        }

    }

    private static void exemploListaSimplesIterandoChaves() {

        System.out.println("****** exemplo lista iterando chaves ****");

        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Paulo Afonso");
        lista.put(2, "Rosana silva");
        lista.put(3, "Pamela siqueira");
        lista.put(4, "Nicolas matheus");
        lista.put(5, "Renan silva");

        for (Integer key : lista.keySet()) {
            System.out.println(key);
        }
    }

    private static void exemploListaSimplesIterandoChaveValor() {

        System.out.println("****** exemplo simples iterando chave e valor");

        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Paulo Afonso");
        lista.put(2, "Rosana silva");
        lista.put(3, "Pamela siqueira");
        lista.put(4, "Nicolas matheus");
        lista.put(5, "Renan silva");

        System.out.println("*** for comum ***");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("*** forEach stream ***");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("*** forEach stream 2 ***");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("*** forEach stream 3 ***");
        lista.values().stream().forEach(System.out::println);

        System.out.println("*** forEach stream 4 ***");
        lista.entrySet().stream().forEach(System.out::println);

        System.out.println("*** forEach stream 5 ***");
        lista.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("*** Iterator ***");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }

        System.out.println("*** Iterator 2 ***");
        Iterator<Map.Entry<Integer, String>> it2 = lista.entrySet().iterator();
        while (it2.hasNext()){
            Map.Entry<Integer, String> entry1 = it2.next();
            System.out.println(entry1.getKey() + " " + entry1.getValue());

        }
    }
}
