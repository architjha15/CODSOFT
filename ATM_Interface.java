import java.util.Scanner;

public class ATM_Interface {
    public static void main(String[] args) {
        int balance = 1000000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check balance");
            System.out.println("Choose 4 for exit");
            System.out.print("Choose the operation you want to perform: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: //withdraw amount
                    System.out.print("Enter money to be withdrawn: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2: //deposit amount
                    System.out.print("Enter amount of cash that is being added in account: ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited.");
                    System.out.println("");
                    break;

                case 3: //check balance
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;

                case 4: //exit from the program
                    System.exit(0);
            }
        }
    }
}