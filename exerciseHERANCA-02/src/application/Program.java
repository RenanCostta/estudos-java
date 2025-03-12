package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

import java.util.Locale;
import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.US);
            Locale.setDefault(Locale.US);

            Account acc = new Account(1001, "Alex", 0.0);
            BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

            //UPCASTING

            Account acc1 = bacc;
            Account acc2 = new BusinessAccount(1003, "John", 0.0, 500.0);
            Account acc3 = new SavingAccount(1004, "Ana", 0.0, 0.01);


            // DOWN CASTING

            BusinessAccount acc4 = (BusinessAccount)acc2;
            acc4.loan(100.0);

            //BusinessAccount acc5 = (BusinessAccount)acc3;

            if (acc3 instanceof BusinessAccount) {
                BusinessAccount acc5 = (BusinessAccount)acc3;
                acc5.loan(100.0);
                System.out.println("Loan!");
            }
            if (acc3 instanceof SavingAccount) {
                SavingAccount acc5 = (SavingAccount)acc3;
                acc5.updateBalance();
                System.out.println("Update!");
            }

            // Sobreposição, palavra super, anotação @Override

            Account acc0 = new Account(1001, "Rennan", 1000.0);
            acc0.withDraw(200.0);
            System.out.println("Saldo da conta: " + acc0.getBalance());

            Account acc01 = new SavingAccount(1007, "Rennann", 1000.0, 0.01);
            acc01.withDraw(200.0);
            System.out.println(acc01.getBalance());

            Account acc02 = new BusinessAccount(1008, "José", 1000.0, 500.0);
            acc02.withDraw(200.0);
            System.out.println(acc02.getBalance());

            

            sc.close();
        }
    }
