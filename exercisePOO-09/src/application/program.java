package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Account;


public class program {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;


        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        String holder = sc.next();
        System.out.println();

        System.out.println("Is there a initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }


        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated deposit value: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated deposit value: ");
        System.out.println(account);



        sc.close();
    }
}
