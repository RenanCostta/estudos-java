package application;

import entities.Account;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withDraw(50.0);
        y.withDraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());



        sc.close();
    }
}
