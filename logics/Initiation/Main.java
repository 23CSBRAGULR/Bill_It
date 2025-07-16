package Bill_It.logics.Initiation;

import Bill_It.logics.Databases.CustomerDB;
import Bill_It.logics.Databases.InvoiceDB;
import Bill_It.logics.Databases.ProductDB;
import Bill_It.logics.Databases.UserDB;

public class Main {
    public static void main(String[] args) {
        LogIn login = new LogIn();
        login.start();
        UserDB userDB = new UserDB();
        userDB.start();
        CustomerDB customerDB = new CustomerDB();
        customerDB.start();
        InvoiceDB invoiceDB = new InvoiceDB();
        invoiceDB.start();
        ProductDB productDB = new ProductDB();
        productDB.start();
    }
}