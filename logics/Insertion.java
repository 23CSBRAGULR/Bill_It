package Bill_It.logics;

import java.util.ArrayList;
import java.util.Scanner;

public class Insertion {
    void insertion(ArrayList<String> items, ArrayList<Integer> quantities, ArrayList<Double> prices) {
        Scanner insert = new Scanner(System.in);
        String item;
        int quantity;
        double price;

        System.out.print("Enter item name: ");
        item = insert.nextLine();
        items.add(item);

        System.out.print("Enter quantity: ");
        quantity = insert.nextInt();
        quantities.add(quantity);

        System.out.print("Enter price: ");
        price = insert.nextDouble();
        prices.add(price);
        
        System.out.println("Item added successfully!");
        System.out.println("View the items in the list? (yes/no)");
        String viewChoice = insert.next();
        if (viewChoice.equals("yes")) {
            System.out.println("Items\t\t: " + items);
            System.out.println("Quantities\t\t: " + quantities);
            System.out.println("Prices\t\t: " + prices);
        } else {
            System.out.println("You chose not to view the items.");
        }
        insert.close();
    }
}