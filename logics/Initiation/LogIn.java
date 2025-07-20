package Bill_It.logics.Initiation;

import java.util.Scanner;

import Bill_It.logics.Users.Admin;
import Bill_It.logics.Users.Staff;

public class LogIn {

    public void start() {
        System.out.println("Welcome to the Bill It System");
        whosUsing();
    }

    public void whosUsing() {
        Scanner userInfo = new Scanner(System.in);
        System.out.println("Who is using the system?");
        System.out.println("1. Admin");
        System.out.println("2. Staff");
        System.out.println("3. Exit");
        System.out.print("Please enter the number corresponding to your role: ");
        Authorization auth = new Authorization();
        // Read user input for role selection
        int userType = userInfo.nextInt();
        String username, password;
        if (userType == 1) {
            System.out.println("\nADMIN LOGIN\n");
            System.out.print("Enter your Username : ");
            username = userInfo.next();
            System.out.print("\nEnter your Password : ");
            password = userInfo.next();
            if(auth.adminLogin(username, password)) {
                Admin admin = new Admin();
                admin.start();
            } else {
                invalid();
            }
        } else if (userType == 2) {
            System.out.println("\nSTAFF LOGIN\n");
            System.out.print("Enter your Username : ");
            username = userInfo.next();
            System.out.print("\nEnter your Password : ");
            password = userInfo.next();
            if(auth.staffLogin(username, password)) {
                Staff staff = new Staff();
                staff.login();
            } else {
                invalid();
            }
        } else if(userType == 3) {
            System.out.println("Exiting the system. Goodbye!");
            System.exit(0);
        }
        else {
            System.out.println("Invalid choice. Please try again.");
            whosUsing(); // Prompt again for valid input
        }

        userInfo.close();
    }

    public void invalid() {
        System.out.println("Invalid Credentials. Please log in again");
        whosUsing(); // Prompt again for valid credentials
    }

}