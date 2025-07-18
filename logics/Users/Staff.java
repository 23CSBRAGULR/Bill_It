package Bill_It.logics.Users;

import java.util.Scanner;

import Bill_It.logics.Initiation.LogOut;

public class Staff {

    public void login() {
        System.out.println("Staff login successful.");
        System.out.println("What would you like to do?");
        System.out.println("1. Make a Sale (Generate Bill)");
        System.out.println("2. View/Modify Products");
        System.out.println("3. View/Modify Bills");
        System.out.println("4. View/Modify Customers");
        System.out.println("5. View Invoices");
        System.out.println("6. Logout");
        System.out.print("Please enter the number corresponding to your action: ");
        Scanner operation = new Scanner(System.in);
        int choice = operation.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sale process initiated");
                break;
            case 2:
                System.out.println("Product Database accessing process initiated");
                break;
            case 3:
                System.out.println("Bill Database accessing process initiated");
                break;
            case 4:
                System.out.println("Customer Database accessing process initiated");
                break;
            case 5:
                System.out.println("Invoice Database accessing process initiated");
                break;
            case 6:
                System.out.println("Logging Out...");
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