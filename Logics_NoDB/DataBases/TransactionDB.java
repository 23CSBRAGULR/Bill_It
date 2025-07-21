package Bill_It.Logics_NoDB.DataBases;

import java.util.ArrayList;
import java.util.Scanner;

import Bill_It.Logics_NoDB.Users.*;

public class TransactionDB extends Admin {

    public final String[] transactionHeaders = {"S.No", "Transaction ID", "Customer Name", "Product Name", "Amount", "Type"};
    public final String[] transactionData = new String[6];
    ArrayList<ArrayList<String>> transactions = new ArrayList<>();
    public int transactionCount = 0; // To keep track of the number of transactions
    public int totalRevenue = 0; // To keep track of total revenue
    public int totalExpense = 0; // To keep track of total expenses
    public int totalProfit = 0; // To keep track of total profit
    Scanner choices = new Scanner(System.in);

    public void addTransaction(String transactionId, String customerName, String productName, String amount) {
        ArrayList<String> transaction = new ArrayList<>();
        transaction.add(String.valueOf(++transactionCount)); // S.No
        transaction.add(transactionId);
        transaction.add(customerName);
        transaction.add(productName);
        transaction.add(amount);
        transaction.add("Credit"); // Assuming all transactions are credit for simplicity
        transactions.add(transaction);
    }

    public void viewTransactions() {
        calculateTotalRevenue();
        System.out.println("\n\t\t\t\t\tTransactions");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for (String data : transactionHeaders) {
            System.out.printf("%-20s", data);
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < transactionCount; i++) {
            for (String data : transactions.get(i)) {
                System.out.printf("%-20s", data);
            }
            System.out.println(); // New line after each transaction
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Total Transactions: " + transactionCount);
        System.out.println("Total Revenue: " + totalRevenue);
        System.out.println("Total Expenses: " + totalExpense);
        System.out.println("Total Profit: " + (totalRevenue - totalExpense));
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Press any key to continue...");
        choices.nextLine(); // Wait for user input to continue
        operation(); // Return to the operation menu
    }

    public void start() {
        // Initialize the transaction database with some default transactions
        addTransaction("T001", "John Doe", "Tablets", "1200");
        addTransaction("T002", "Jane Smith", "Syrups", "800");
        addTransaction("T003", "Alice Johnson", "Ointment", "300");
        addTransaction("T004", "Bob Brown", "Tablet", "150");
        addTransaction("T005", "Charlie White", "Lotion", "250");

        viewTransactions();
    }

    public void operation() {
        System.out.println("\nWhat would you like to do now?");
        System.out.println("1. View Transactions (again)");
        System.out.println("2. Exit to the main menu");
        System.out.print("Enter the number corresponding to your action : ");
        int action = choices.nextInt();

        switch(action) {
            case 1:
                viewTransactions();
                break;
            case 2:
                if (this instanceof Staff) {
                    System.out.println("\nStaff logged out successfully.");
                    Staff mainmenu = new Staff();
                    mainmenu.login();
                } else if (this instanceof Admin) {
                    System.out.println("\nAdmin logged out successfully.");
                    Admin mainmenu = new Admin();
                    mainmenu.login();
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                operation(); // Prompt again for valid input
                break;
        }
        choices.close();
    }

    public void calculateTotalRevenue() {
        int sum = 0;
        for (ArrayList<String> transaction : transactions) {
            String amountStr = transaction.get(4); // "Amount" is at index 4
            try {
                int amount = Integer.parseInt(amountStr);
                sum += amount;
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount format in transaction: " + transaction);
            }
        }
        totalRevenue = sum;
    }
}