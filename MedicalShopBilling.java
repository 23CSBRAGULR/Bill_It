package Bill_It;

import java.util.*;

class Medicine {
    String name;
    int quantity;
    double price;

    Medicine(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double getTotalPrice() {
        return quantity * price;
    }
}

public class MedicalShopBilling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Medicine> cart = new ArrayList<>();
        System.out.println("🩺 Welcome to Ragul's Medical Shop 🧾");

        while (true) {
            System.out.print("\nEnter Medicine Name (or type 'done' to finish): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter Price per unit: ₹");
            double price = sc.nextDouble();
            sc.nextLine(); // Clear buffer

            cart.add(new Medicine(name, qty, price));
        }

        sc.close();
        // Bill Display
        double grandTotal = 0;
        System.out.println("\n📄------- Bill Summary -------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Medicine", "Qty", "Price", "Total");

        for (Medicine m : cart) {
            double total = m.getTotalPrice();
            grandTotal += total;
            System.out.printf("%-20s %-10d %-10.2f %-10.2f\n", m.name, m.quantity, m.price, total);
        }

        System.out.println("---------------------------------------");
        System.out.print(cart);
        //System.out.printf("🧮 Grand Total: ₹%.2f\n", grandTotal);
        //System.out.println("💊 Thank you! Stay Healthy.\n");
    }
}
