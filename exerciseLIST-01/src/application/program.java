package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Renan"); //adicionando a lista
        list.add("Jully");
        list.add("Rosana");
        list.add("Paulo");
        list.add("Michelle");
        list.add("Jose");
        list.add("Juan");
        list.add("Alex");
        list.add("nicolas");

        list.add(2,"lupi");//adicionando a lista por posição

        System.out.println(list.size());

        list.remove("Paulo");//remoção pelo mesmo valor

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------");
        list.removeIf(x -> x.charAt(0) == 'R'); // Remoção por predicado (função lambda)
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        System.out.println("Index of Jully: " + list.indexOf("Jully"));
        System.out.println("Index of Jair: " + list.indexOf("Jair"));//Nomes que não estão na lista
        System.out.println("Index of Lula: " + list.indexOf("Lula"));//

        System.out.println("-----------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').toList();
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);//procura o primeiro nome com a letra "J" ou retorna um null
        String name2 = list.stream().filter(x -> x.charAt(0) == 'N').findFirst().orElse(null);
        System.out.println(name);
        System.out.println(name2);

        System.out.println("-------------------------");

        String entrada;
        System.out.println("Adicione pessoas (ou digite '0' para encerrar)");
        while (true) {

            entrada = sc.nextLine();

            if (entrada.equals("0")) {
                break;
            }

            list.add(entrada);
        }

        for (String x : list) {
            System.out.println(x);
        }

    }
}
