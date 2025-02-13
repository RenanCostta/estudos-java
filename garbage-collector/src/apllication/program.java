package apllication;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product p1, p2;

        p1 = new Product("TV", 900.00, 0);
        p2 = new Product("mouse", 30.00, 0);

        System.out.println(p1);
        System.out.println(p2);

        p1 = p2;
        System.out.println(p1);

        

    }
}
