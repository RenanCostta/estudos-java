package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Account acc1 = new Account(1020, "Alex", 1000.0);
        Account acc2 = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1025, "Alex", 1000.0, 0.0);

        acc1.withDraw(50.0);
        acc2.withDraw(50.0);
        acc3.withDraw(50.0);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getBalance());


        sc.close();
    }
}
