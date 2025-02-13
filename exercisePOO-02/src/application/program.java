package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Product;

public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("enter product data: ");
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        product.setPrice(500.00);
        System.out.println("Update price: " + product.getPrice());

        System.out.println();
        System.out.println("product data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("updated data: " + product);



        sc.close();
    }

}