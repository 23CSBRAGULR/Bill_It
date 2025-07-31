package Bill_It.logics.Initiation;

import java.sql.SQLException;
import java.util.Scanner;

public class LogIn extends Main {

    public void start() {
        System.out.println("Welcome to the Bill It System");
        try {
            whosUsing();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void whosUsing() throws SQLException {
        Scanner userInfo = new Scanner(System.in);
        System.out.println("Who is using the system?");
        System.out.println("1. Admin");
        System.out.println("2. Staff");
        System.out.println("3. Exit");
        System.out.print("Please enter the number corresponding to your role: ");
        Validation validation = new Validation();
        // Read user input for role selection
        int userType = userInfo.nextInt();
        userInfo.nextLine(); // Clear the buffer
        String username, password;
        if (userType == 1) {
            System.out.print("Enter Admin Username: ");
            username = userInfo.nextLine();
            if (validation.validateAdminName(username)) {
                System.out.print("Enter Admin Password: ");
                password = userInfo.next();
                int invalidCount = 0;
                do {
                    if (invalidCount > 0) {
                        System.out.println("Invalid Password. Please try again. Attempts left: " + (3 - invalidCount));
                        System.out.print("Enter Admin Password: ");
                        userInfo.nextLine(); // Clear the buffer
                    }
                    password = userInfo.next();
                    invalidCount++;
                } while (!validation.validateAdminPassword(username, password) && invalidCount < 3);
                if (!validation.validateAdminPassword(username, password)) {
                    System.out.print("No Attempts left. Due to ");
                    invalid();
                } else {
                    validation.adminLogin(); // Valid admin credentials
                }
            } else {
                invalid(); // Invalid user type
            }
        } else if (userType == 2) {
            System.out.print("Enter Staff Username: ");
            username = userInfo.next();
            if (validation.validateStaffName(username)) {
                System.out.print("Enter Staff Password: ");
                password = userInfo.next();
                int invalidCount = 0;
                do {
                    if (invalidCount > 0) {
                        System.out.println("Invalid Password. Please try again. Attempts left: " + (3 - invalidCount));
                        System.out.print("Enter Staff Password: ");
                        userInfo.nextLine(); // Clear the buffer
                    }
                    password = userInfo.next();
                    invalidCount++;
                } while (!validation.validateStaffPassword(username, password) && invalidCount < 3);
                if (!validation.validateStaffPassword(username, password)) {
                    System.out.print("No Attempts left. Due to ");
                    invalid();
                } else {
                    validation.staffLogin(); // Valid admin credentials
                }
            } else {
                invalid(); // Invalid user type
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

    public void invalid() throws SQLException {
        System.out.println("Invalid Credentials. Please try logging in again");
        whosUsing(); // Prompt again for valid credentials
    }

}