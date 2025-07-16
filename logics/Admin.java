package Bill_It.logics;

import java.util.Scanner;

public class Admin {

    public void login() {
        Scanner operation = new Scanner(System.in);

        System.out.println("Admin logged in successfully.");
        System.out.println("What would you like to do? ");
        System.out.println("1. View Transactions");
        System.out.println("2. View Invoices");
        System.out.println("3. View/Modify Users");
        System.out.println("4. View/Modify Customers");
        System.out.println("5. Log out");
        System.out.print("Please enter the number corresponding to your action: ");
        // Read user input for action selection
        int choice = operation.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Transaction Database Accessing process initiated");
                break;
            case 2:
                System.out.println("Invoice Database Accessing process initiated");
                break;
            case 3:
                System.out.println("User Database Accessing process initiated");
                break;
            case 4:
                System.out.println("Customer Database Accessing process initiated");
                break;
            case 5:
                System.out.println("Logging out...");
                LogOut logout = new LogOut();
                logout.logOut();
                break;
            default:
                System.out.println("Invalid action. Please try again.");
                login(); // Prompt again for valid input
                break;
        }

        operation.close();
    }

}