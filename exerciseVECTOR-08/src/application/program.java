package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int[] aVect = new int[n];
        int[] bVect = new int[n];
        int[] cVect = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            aVect[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            bVect[i] = sc.nextInt();
        }

        //soma dos vetores a, b
        for (int i = 0; i < n; i++) {
            cVect[i] = aVect[i] + bVect[i];
        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < n; i++) {
            System.out.println(cVect[i]);
        }

    }
}
