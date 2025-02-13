package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);


        int n, posMaior;
        double maior;

        System.out.print("Qunatos numeros vai digitar? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        maior = vect[0];
        posMaior = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.printf("POSICÃO DO MAIOR VALOR = %d\n", posMaior);


        sc.close();
    }
}
