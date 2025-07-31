package Bill_It.logics.Users;

import java.util.Scanner;

import Bill_It.no_DB_Version.DataBases.TransactionDB;
import Bill_It.no_DB_Version.Initiation.LogOut;

public class Admin {

    Scanner operation = new Scanner(System.in);

    public void start() {
        System.out.println("\nAdmin logged in successfully.");
        login();
    }

    public void login() {
        System.out.println("\nWhat would you like to do? ");
        System.out.println("1. View Transactions");
        System.out.println("2. View Invoices (Store)");
        System.out.println("3. View/Modify Bill (Customers)");
        System.out.println("4. View/Modify Users");
        System.out.println("5. View/Modify Customers");
        System.out.println("6. View/Modify Products");
        System.out.println("7. Log out");
        System.out.print("Please enter the number corresponding to your action: ");
        // Read user input for action selection
        int choice = operation.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nTransaction Database Accessing process initiated");
                TransactionDB transactions = new TransactionDB();
                transactions.start();
                break;
            case 2:
                System.out.println("\nInvoice Database Accessing process initiated");
                break;
            case 3:
                System.out.println("\nBill Database Accessing process initiated");
                break;
            case 4:
                System.out.println("\nUser Database Accessing process initiated");
                break;
            case 5:
                System.out.println("\nCustomer Database Accessing process initiated");
                break;
            case 6: 
                System.out.println("\nProduct Database Accessing process initiated");
                break;
            case 7:
                System.out.println("\nLogging out");
                LogOut logout = new LogOut();
                logout.logOut();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                login(); // Prompt again for valid input
                break;
        }

        operation.close();
    }

}