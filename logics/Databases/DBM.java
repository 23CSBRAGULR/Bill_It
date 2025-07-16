package Bill_It.logics.DataBases;

public class DBM {
    public void start() {
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