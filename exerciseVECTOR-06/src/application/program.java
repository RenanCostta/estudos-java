package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);


        System.out.println("Quantos numeros vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        int qPares = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
                if (vect[i] % 2 == 0 ) {
                    qPares++;
                }
        }

        System.out.println("Numeros pares: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0 ) {
                System.out.print(vect[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Quantidade de pares: " + qPares);

    }
}
