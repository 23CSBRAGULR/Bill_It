package Bill_It.logics.Initiation;

import java.sql.SQLException;
import Bill_It.logics.DataBases.UserDB;
import Bill_It.logics.Users.*;

public class Validation extends LogIn {
    UserDB validate = new UserDB();
    boolean eligibility = false;

    public boolean validateAdminName(String username) throws SQLException{
        eligibility = validate.validateAdmin(username);
        return eligibility;
    }

    public boolean validateStaffName(String username) throws SQLException {
        eligibility = validate.validateStaff(username);
        return eligibility;
    }

    public boolean validateAdminPassword(String username, String password) throws SQLException {
        eligibility = validate.validateAdmin(username, password);
        return eligibility;
    }

    public boolean validateStaffPassword(String username, String password) throws SQLException {
        eligibility = validate.validateStaff(username, password);
        return eligibility;
    }

    public void adminLogin() {
        Admin admin = new Admin();
        admin.start();
    }

    public void staffLogin() {
        Staff staff = new Staff();
        staff.start();
    }
}