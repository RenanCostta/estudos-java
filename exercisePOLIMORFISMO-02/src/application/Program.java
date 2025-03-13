package application;

import entities.Employee;
import entities.OutsourceEmployee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " Data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y' || ch == 'Y') {
                System.out.println("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else if (ch == 'n' || ch == 'N') {
                list.add(new Employee(name, hours, valuePerHour));
            }

        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - " + emp.getHours() + " - $ " + String.format("%.2f", emp.payment()));
        }



        sc.close();
    }
}
