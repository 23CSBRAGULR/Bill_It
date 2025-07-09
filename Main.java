package Bill_It;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

try {
    Class.forName("com.mysql.cj.jdbc.Driver"); // Load the driver

    Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/test", "root", ""
    );
    System.out.println("✅ Connected to MariaDB!");
    
} catch (SQLException e) {
    System.out.println("❌ Connection failed:");
    e.printStackTrace();
} catch (ClassNotFoundException e) {
    System.out.println("❌ MySQL Driver not found:");
    e.printStackTrace();
}
    }
}
