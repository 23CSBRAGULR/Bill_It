package Bill_It.logics;

import java.util.Scanner;

public class Staff {

    public void login() {
        System.out.println("Staff login successful.");
        System.out.print("What would you like to do? ");
        System.out.println("1. View Invoice Database");
        System.out.println("2. View/Modify Product Database");
        System.out.println("3. View/Modify Customer Database");
        System.out.println("4. Logout");
        Scanner operation = new Scanner(System.in);
        int choice = operation.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Accessing Bill Database...");
                break;
            case 2:
                System.out.println("Accessing Product Database...");
                break;
            case 3:
                System.out.println("Accessing Customer Database...");
                break;
            case 4:
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