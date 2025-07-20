package Bill_It.logics.DataBases;

import java.util.ArrayList;

public class TransactionDB {

    public final String[] transactionHeaders = {"S.No", "Transaction ID", "Customer Name", "Product Name", "Amount"};
    public final String[] transactionData = new String[5];
    ArrayList<ArrayList<String>> transactions = new ArrayList<>();
    public static int transactionCount = 0; // To keep track of the number of transactions

    public void addTransaction(String transactionId, String customerName, String productName, String amount) {
        ArrayList<String> transaction = new ArrayList<>();
        transaction.add(String.valueOf(++transactionCount)); // S.No
        transaction.add(transactionId);
        transaction.add(customerName);
        transaction.add(productName);
        transaction.add(amount);
        transactions.add(transaction);
    }

    public void viewTransactions() {
        System.out.println("Transaction List:");
        for (String data : transactionHeaders) {
            System.out.print(data + "\t");
        }
        System.out.println();
        for (int i = 0; i < transactionCount; i++) {
            for (String data : transactions.get(i)) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }

    public void start() {
        // Initialize the transaction database with some default transactions
        addTransaction("T001", "John Doe", "Laptop", "1200");
        addTransaction("T002", "Jane Smith", "Smartphone", "800");
        addTransaction("T003", "Alice Johnson", "Tablet", "300");
        addTransaction("T004", "Bob Brown", "Headphones", "150");
        addTransaction("T005", "Charlie White", "Smartwatch", "250");

        // Print the initialized transactions
        viewTransactions();
    }

}