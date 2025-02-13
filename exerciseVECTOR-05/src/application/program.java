package application;
import entities.person;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.println("how many people will be registered? ");
        int n = sc.nextInt();

        person[] vect = new person[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vect[i] = new person(name, age, height);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
        }

        double avg = sum / vect.length;
        System.out.printf("Height Average: %.2f%n ", avg);

        double sumAge = 0.0;
        double nMenores= 0.0;
        String nameMenores = "-";
        for (int i = 0; i < vect.length; i++) {
            sumAge += vect[i].getAge();
                if (vect[i].getAge() < 16) {
                    nameMenores = nameMenores + '[' + (vect[i].getName() + ']');
                    nMenores ++;
                }
        }

        double pmenores = (nMenores / vect.length) * 100;
        System.out.println("% of younger ages is: " + pmenores + "%");

        System.out.println(nameMenores);
    }
}
