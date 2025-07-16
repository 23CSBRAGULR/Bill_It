package Bill_It.logics.Initiation;

import java.util.Scanner;

import Bill_It.logics.Users.Admin;
import Bill_It.logics.Users.Staff;
import Bill_It.logics.DataBases.DBM;

public class LogIn {

    public void start() {
        System.out.println("Welcome to the Bill It System");
        DBM dbm = new DBM();
        dbm.start(); // Initialize all databases
        whosUsing();
    }

    public void whosUsing() {
        Scanner user = new Scanner(System.in);
        System.out.print("Who is using the system?");
        System.out.println("1. Admin");
        System.out.println("2. Staff");
        System.out.println("3. Exit");
        System.out.print("Please enter the number corresponding to your role: ");
        // Read user input for role selection
        int userType = user.nextInt();
        if (userType == 1) {
            System.out.println("Admin login process initiated.");
            Admin admin = new Admin();
            admin.login();
        } else if (userType == 2) {
            System.out.println("Staff login process initiated.");
            Staff staff = new Staff();
            staff.login();
        } else if(userType == 3) {
            System.out.println("Exiting the system. Goodbye!");
            System.exit(0);
        }
        else {
            System.out.println("Invalid choice. Please try again.");
            whosUsing(); // Prompt again for valid input
        }
        user.close();
    }

}