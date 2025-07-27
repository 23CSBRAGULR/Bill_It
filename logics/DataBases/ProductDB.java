package Bill_It.no_DB_Version.DataBases;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductDB {
    String name;
    int qty;
    double price;

    HashMap<String, HashMap<String, ArrayList<ProductDB>>> productTypes = new HashMap<>();

    public ProductDB() {}

    public ProductDB(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    private void addProduct(String category, String subcategory, String name, int qty, double price) {
        productTypes.putIfAbsent(category, new HashMap<>());
        HashMap<String, ArrayList<ProductDB>> subMap = productTypes.get(category);
        subMap.putIfAbsent(subcategory, new ArrayList<>());
        subMap.get(subcategory).add(new ProductDB(name, qty, price));
    }

    public void start() {
        addProduct("Tablets and Capsules", "Paracetamol", "Paracetamol", 10, 50.0);
        addProduct("Tablets and Capsules", "Ibuprofen", "Ibuprofen", 20, 75.0);

        addProduct("Ointments and Lotions", "Antiseptic Cream", "Antiseptic Cream", 15, 30.0);
        addProduct("Ointments and Lotions", "Moisturizing Lotion", "Moisturizing Lotion", 25, 60.0);

        addProduct("Syrups and Juices", "Cough Syrup", "Cough Syrup", 12, 40.0);
        addProduct("Syrups and Juices", "Vitamin Juice", "Vitamin Juice", 18, 55.0);

        addProduct("Cosmetics", "Lip Balm", "Lip Balm", 30, 20.0);
        addProduct("Cosmetics", "Face Cream", "Face Cream", 22, 80.0);

        addProduct("Inhalers and Rotacaps", "Asthma Inhaler", "Asthma Inhaler", 5, 150.0);
        addProduct("Inhalers and Rotacaps", "Rotacap", "Rotacap", 8, 120.0);

        addProduct("Injections and Suppositories", "Pain Relief Injection", "Pain Relief Injection", 3, 200.0);
        addProduct("Injections and Suppositories", "Suppository", "Suppository", 4, 180.0);

        addProduct("Infusions and Respules", "IV Infusion", "IV Infusion", 2, 500.0);
        addProduct("Infusions and Respules", "Respule", "Respule", 6, 300.0);

        addProduct("Eye and Ear Drops", "Eye Drop", "Eye Drop", 10, 25.0);
        addProduct("Eye and Ear Drops", "Ear Drop", "Ear Drop", 8, 30.0);

        addProduct("Syringes and Needles", "Syringe", "Syringe", 50, 5.0);
        addProduct("Syringes and Needles", "Needle", "Needle", 100, 2.0);

        addProduct("Bandages and Dressing", "Adhesive Bandage", "Adhesive Bandage", 40, 10.0);
        addProduct("Bandages and Dressing", "Gauze Dressing", "Gauze Dressing", 30, 15.0);

        addProduct("Sprays", "Disinfectant Spray", "Disinfectant Spray", 20, 35.0);
        addProduct("Sprays", "Insect Repellent Spray", "Insect Repellent Spray", 15, 40.0);

        addProduct("Other Products", "Thermometer", "Thermometer", 25, 60.0);
    }
}