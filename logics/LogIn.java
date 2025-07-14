package Bill_It.logics;

import java.util.Scanner;

public class LogIn {

    public void start() {
        System.out.println("Welcome to the Bill It System!");
        whosUsing();
    }

    public void whosUsing() {
        Scanner user = new Scanner(System.in);
        System.out.print("Who is using the system? (Admin/Staff) : ");
        String userType = user.nextLine().trim().toLowerCase();
        if (userType.equals("admin")) {
            System.out.println("Admin login process initiated.");
            Admin admin = new Admin();
            admin.login();
        } else if (userType.equals("staff")) {
            System.out.println("Staff login process initiated.");
            Staff staff = new Staff();
            staff.login();
        } else {
            System.out.println("Invalid user type. Please enter 'Admin' or 'Staff'.");
            whosUsing(); // Prompt again for valid input
        }
        user.close();
    }

}