package Bill_It.logics.Databases;

import java.util.Scanner;
import java.util.ArrayList;

class Ointment extends ProductDB {
    String name;
    double price;
    int quantity;

    public Ointment(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void ointments() {
        ArrayList<Ointment> list = new ArrayList<>();
        list.add(new Ointment("Flyfung Cream", 45.00, 5));
        list.add(new Ointment("Krack Cream", 75.50, 10));
        list.add(new Ointment("Clocip B Cream", 125.00, 4));

        System.out.printf("| %-12s | %-6s | %-8s |\n", "Name", "Price", "Quantity");
        System.out.println("|--------------|--------|----------|");
        for (Ointment o : list) {
            System.out.printf("| %-12s | %-6.2f | %-8d |\n", o.name, o.price, o.quantity);
        }
    }

}

class Tablets extends ProductDB {
    String name;
    double price;
    int quantity;

    public Tablets(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void tablets() {
        ArrayList<Tablets> list = new ArrayList<>();
        list.add(new Tablets("Dolo 650 Tablet", 2.30, 90));
        list.add(new Tablets("Erythro 500 Tablet", 5.50, 50));
        list.add(new Tablets("Pan 40 Tablet", 15.00, 150));

        System.out.printf("| %-12s | %-6s | %-8s |\n", "Name", "Price", "Quantity");
        System.out.println("|--------------|--------|----------|");
        for (Tablets t : list) {
            System.out.printf("| %-12s | %-6.2f | %-8d |\n", t.name, t.price, t.quantity);
        }
    }
}

class Syrup extends ProductDB {
    String name;
    double price;
    int quantity;

    public Syrup(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void syrups() {
        ArrayList<Syrup> list = new ArrayList<>();
        list.add(new Syrup("Zincovit Syrup", 110.00, 18));
        list.add(new Syrup("Dexorange Syrup", 155.50, 10));
        list.add(new Syrup("Asthalin Syrup", 25.00, 7));

        System.out.printf("| %-12s | %-6s | %-8s |\n", "Name", "Price", "Quantity");
        System.out.println("|--------------|--------|----------|");
        for (Syrup s : list) {
            System.out.printf("| %-12s | %-6.2f | %-8d |\n", s.name, s.price, s.quantity);
        }
    }
}

public class ProductDB {
    ProductDB ointment = new Ointment("Ointment A", 50.00, 10);
    ProductDB tablet = new Tablets("Tablet A", 30.00, 20);
    ProductDB syrup = new Syrup("Syrup A", 40.00, 18);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of medicine (ointment/tablet/syrup): ");
        String type = scanner.nextLine().toLowerCase();
        switch (type) {
            case "ointment":
                Ointment ointment = new Ointment("Ointment A", 50.00, 10);
                ointment.ointments();
                break;
            case "tablet":
                Tablets tablet = new Tablets("Tablet A", 30.00, 20);
                tablet.tablets();
                break;
            case "syrup":
                Syrup syrup = new Syrup("Syrup A", 40.00, 18);
                syrup.syrups();
                break;
            default:
                System.out.println("Invalid type of medicine.");
        }
        scanner.close();
    }
}