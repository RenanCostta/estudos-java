package aplicacao;

import entidades.rectangle;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        rectangle rect = new rectangle();

        System.out.println("Enter the values of width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGOANL = %.2f%n", rect.diagonal()) ;

        sc.close();
    }
}
