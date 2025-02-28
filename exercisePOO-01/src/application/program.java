package application;

import entities.Bicycle;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike1.changeSpeed(10);
        bike1.changeGear(5);
        System.out.println("Bicicleta 1: " + bike1.toString());

        bike2.changeCadence(50);
        bike2.changeSpeed(10);
        bike2.changeGear(2);
        bike1.changeCadence(40);
        bike2.changeSpeed(15);
        bike2.changeGear(3);
        System.out.println("Bicicleta 2: " + bike2.toString());




    }
}
