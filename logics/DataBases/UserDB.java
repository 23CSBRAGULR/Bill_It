package Bill_It.no_DB_Version.DataBases;

import java.util.HashMap;

public class UserDB {
    public HashMap<String, String> admins = new HashMap<>();
    public HashMap<String, String> staffs = new HashMap<>();

    public void newAdmin(String username, String password) {
        admins.put(username, password);
    }

    public void newStaff(String username, String password) {
        staffs.put(username, password);
    }

    public void start() {
        // Initialize the user database with some default users
        newAdmin("ragul", "adminragul");
        newAdmin("ram", "adminram");
        newAdmin("dharniesh", "admindharniesh");
        newStaff("mathavan", "staffmathavan");
        newStaff("siva", "staffsiva");
        newStaff("jayanthi", "staffjayanthi");
    }
}