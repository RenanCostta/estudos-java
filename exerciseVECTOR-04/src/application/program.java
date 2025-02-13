package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int n;

        System.out.println("Quantos numeros você vai digitar? ");
        n = sc.nextInt();

        float[] vect = new float[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextFloat();
        }

        for (int i = 0; i < vect.length; i++) {
            System.out.println("VALUES: " + '[' +  vect[i] + ']');
        }


        float sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        System.out.printf("SOMA: %.2f%n", sum);

        float avg = sum / vect.length;
        System.out.printf("AVERAGE  IS: %.2f%n", avg);


        sc.close();
    }
}
