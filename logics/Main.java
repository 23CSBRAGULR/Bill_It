package Bill_It.logics;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayLists to store items, quantities, and prices
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        // Create an instance of the Insertion class
        Insertion insert = new Insertion();

        // Scanner for user input
        Scanner choice = new Scanner(System.in);
        System.out.println("-------- Bill It --------");
        while(true) {
            // Display the menu options
            System.out.println("Menu:");
            System.out.println("1. Insert Item");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int userChoice = choice.nextInt();

            // Handle user choices
            switch (userChoice) {
                case 1:
                    // Call the insertion method to add an item
                    insert.insertion(items, quantities, prices);
                    break;
                case 2:
                    // Exit the program
                    System.out.println("Exiting the program. Thank you!");
                    choice.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }   
}
