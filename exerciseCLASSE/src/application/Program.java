package application;

import entities.Bicycle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira Bike");
        System.out.println();
        System.out.print("Cadência inicial: ");
        int cadence = sc.nextInt();
        System.out.print("Velocidade inicial: ");
        int velocidade = sc.nextInt();
        System.out.print("Marcha inicial: ");
        int marcha = sc.nextInt();
        Bicycle bike1 = new Bicycle(cadence, velocidade, marcha);

        bike1.changeCadence(37);
        bike1.speedUp(15);
        bike1.applyBreaks(5);
        bike1.changeGear(5);


        System.out.println(bike1.toString());






        sc.close();
    }
}
