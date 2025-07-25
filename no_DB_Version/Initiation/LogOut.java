package Bill_It.no_DB_Version.Initiation;

import java.util.Scanner;

public class LogOut {
    
    static void nextProcess() {
        Scanner choice = new Scanner(System.in);
        System.out.println("\nWhat would you like to do next?");
        System.out.println("1. Log in again");
        System.out.println("2. Exit");
        System.out.print("Please enter the number corresponding to your choice: ");
        // Read user input for next action
        int desicion = choice.nextInt();
        switch (desicion) {
            case 1:
                LogIn login = new LogIn();
                login.whosUsing();
                break;
            case 2:
                System.out.println("\nExiting the system. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                nextProcess();
        }
        choice.close();
    }

    public void logOut() {
        System.out.println("\nLogged out Successfully");
        nextProcess();
    }

}