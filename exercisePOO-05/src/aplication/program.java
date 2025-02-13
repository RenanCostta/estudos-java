package aplication;

import entities.employee;

import java.util.Scanner;
import java.util.Locale;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee emp = new employee();

        System.out.print("Name; ");
        emp.name = sc.nextLine();
        System.out.print("gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("employee: " + emp);
        System.out.println();

        System.out.print("which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("update data: " + emp);

        sc.close();
    }
}
