import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        byte b = 100;
        short s = 10000;
        int in = 100000;
        long l = 1000000L;
        float f = 10.5f;
        double d = 10.5;
        char c = 'A';
        boolean bool = true;

        String[] meuVetor = new String[10];

        for (int i = 0; i < meuVetor.length; i++) {
            System.out.println(meuVetor[i]);
        }

        System.out.println();
        // Ou se usa um for-each para percorrer essa coleções de números

        for (String nome : meuVetor) {
            System.out.println(nome);
        }


        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Renan");
        nomes.add(null);
        nomes.add("felipe");
        nomes.add("Jorge");
        nomes.add("Jesus");
        nomes.add("Maria");
        nomes.add("Jose");
        nomes.add("Paulo");
        nomes.add("Sabrina carpenter");

        System.out.println(nomes);
        System.out.println(nomes.get(2));

        nomes.remove(2);
        nomes.remove(0);
        nomes.remove(3);

        System.out.println(nomes);
        System.out.println(nomes.getFirst());
        System.out.println(nomes.getLast());
        System.out.println(nomes.clone()); // clona todos os elementos do Array

        for(int i = 0 ; i < nomes.toArray().length; i++) {
            System.out.println("Nome #" + (i + 1));
            System.out.println(nomes.get(i));
        }


        // Ou usa o for-each para percorrer essa coleções do números
        System.out.println();

        for (String n : nomes) {
            System.out.println(n);
        }


        int contador = 0;
        while(contador < 10) {
            System.out.println("Eu estou no bloco while");
            contador++;
        }

        sc.close();
    }
}