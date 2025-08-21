package application;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> product = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++){

            System.out.println("Product #" + i + " Data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(type == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                product.add(new ImportedProduct(name, price, customsFee));
            }
            else if(type == 'u'){
                System.out.print("Manufactured date: ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                product.add(new UsedProduct(name, price, date));
            }
            else{
                product.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product prod : product) {
            System.out.println(prod.priceTag());
        }


        sc.close();
    }
}
