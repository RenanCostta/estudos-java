package application;

import entities.triangle;

import java.util.Locale;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("enter the measures os triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("enter the measures os triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);


        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else if (areaX < areaY) {
            System.out.println("larger area: Y");
        }
        else {
            System.out.println("same area.");
        }
            sc.close();
    }
}