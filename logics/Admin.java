package Bill_It.logics;

import java.util.Scanner;

public class Admin {

    public void login() {
        Scanner operation = new Scanner(System.in);

        System.out.println("Admin logged in successfully.");
        System.out.println("What would you like to do? ");
        System.out.println("1. Insert\n2. Update\n3. Delete\n4. View\n5. Exit");
        System.out.print("Please enter the number corresponding to your action: ");
        // Read user input for action selection
        int choice = operation.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Insert operation selected.");
                Insertion insert = new Insertion();
                insert.insertData();
                break;
            case 2:
                System.out.println("Update operation selected.");
                Update update = new Update();
                update.updateData();
                break;
            case 3:
                System.out.println("Delete operation selected.");
                Deletion delete = new Deletion();
                delete.deleteData();
                break;
            case 4:
                System.out.println("View operation selected.");
                View view = new View();
                view.viewData();
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