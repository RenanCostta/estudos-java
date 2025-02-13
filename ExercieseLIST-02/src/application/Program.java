package application;
import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);


        List<Employee> listEmployees = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(listEmployees, id)) {
                System.out.print("Id already taken! try again: ");
                id = sc.nextInt();
            }


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            listEmployees.add(emp);
        }

        System.out.println();
        System.out.print("enter the Employee id that have salary increase: ");
        int idIncrease = sc.nextInt();

        Employee emp = listEmployees.stream().filter(employee -> employee.getId() == idIncrease).findFirst().get();
        //Integer pos = position(listEmployees, idIncrease);

        if (emp == null) {
            System.out.println("This id doesn´t exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : listEmployees) {
            System.out.println(e);
        }



        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> employeeList, int id) {
        Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}

