package application;

import java.util.Scanner;
import java.util.Locale;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);


        int a = sc.nextInt();

        double[] b = new double[a];

        for (int i = 0; i < a ; i++) {
            b[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < a ; i ++) {
            sum += b[i];
        }

        double avg = sum / a;

        System.out.printf("AVERAGE IS: %.2f%n", avg);



        sc.close();
    }
}
