package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankController {

    public static void main(String[] args) {
        manageAccount();
        BankAccount account = new BankAccount();
        bankTransaction(account);
    }

    public static void manageAccount() {

    }

    private static void bankTransaction(BankAccount account) {
        char option = '0';
        int amount = 0;
        boolean validAmount = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Check Current Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        do {
            System.out.println("\nWhat would you like to do?");
            option = scanner.next().charAt(0);
            System.out.println();

            switch (option){
                case '1':
                    System.out.println("-------------------------------");
                    System.out.println("Check Current Balance");
                    System.out.println("-------------------------------");
                    System.out.println("Your Current Balance: $" + account.checkBalance());
                    System.out.println();
                    break;
                case '2':
                    System.out.println("-------------------------------");
                    System.out.println("Deposit");
                    System.out.println("-------------------------------");
                    do {
                        try {
                            System.out.println("How much would you like to deposit?");
                            amount = scanner.nextInt();
                            if (amount > 0) {
                                account.deposit(amount);
                            } else {
                                System.out.println("You can't deposit negative amount");
                                System.out.println("How much do you want to bet?");
                                amount = scanner.nextInt();
                            }
                            validAmount = false;
                        } catch (InputMismatchException ex) {
                            System.out.println("Try again. (" +
                                    "Incorrect input: an integer is required)");
                            scanner.nextLine();
                        }
                    } while (validAmount);
                    System.out.println("$" + amount + " has been deposited");
                    System.out.println();
                    break;
                case '3':
                    System.out.println("-------------------------------");
                    System.out.println("Withdraw");
                    System.out.println("-------------------------------");
                    System.out.println("$" + " has been withdrawn");
                    System.out.println();
                    break;
            }



        } while (option != '4');

    }

}
