package aplication;

import entities.currencyConverter;

import java.util.Scanner;
import java.util.Locale;


public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the dollar price? ");
        double priceDollar = sc.nextDouble();

        System.out.println("how many dollars will be bought? ");
        double howManyDollars = sc.nextDouble();

        double total = currencyConverter.totalconv(priceDollar, howManyDollars);

        System.out.printf("Amount to be paid in reais: %.2f%n ", total);


        sc.close();
    }
}
