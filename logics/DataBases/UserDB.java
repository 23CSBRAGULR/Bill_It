package Bill_It.logics.DataBases;

import java.sql.*;

public class UserDB {

    private final String url = "jdbc:mysql://localhost:3306/UserDB";
    private final String un = "root";
    private final String pw = "1269";

    public boolean validateAdmin(String username) throws SQLException {
        Connection admins = DriverManager.getConnection(url, un, pw);
        String query = "SELECT COUNT(*) FROM admins WHERE username = ?;";
        PreparedStatement pst = admins.prepareStatement(query);
        pst.setString(1, username);
        int count = pst.executeQuery().getInt(1);
        boolean isValid = (count >= 1) ? true : false;
        return isValid;
    }

    public boolean validateAdmin(String username, String password) throws SQLException {
        Connection admins = DriverManager.getConnection(url, un, pw);
        String query = "SELECT COUNT(*) FROM admins WHERE username = ? AND password = ?;";
        PreparedStatement pst = admins.prepareStatement(query);
        pst.setString(1, username);
        pst.setString(2, password);
        int count = pst.executeQuery().getInt(1);
        boolean isValid = (count >= 1) ? true : false;
        return isValid;
    }

    public boolean validateStaff(String username) throws SQLException {
        Connection staffs = DriverManager.getConnection(url, un, pw);
        String query = "SELECT COUNT(*) FROM admins WHERE username = ?;";
        PreparedStatement pst = staffs.prepareStatement(query);
        pst.setString(1, username);
        int count = pst.executeQuery().getInt(1);
        boolean isValid = (count >= 1) ? true : false;
        return isValid;
    }

    public boolean validateStaff(String username, String password) throws SQLException {
        Connection staffs = DriverManager.getConnection(url, un, pw);
        String query = "SELECT COUNT(*) FROM staffs WHERE username = ? AND password = ?;";
        PreparedStatement pst = staffs.prepareStatement(query);
        pst.setString(1, username);
        pst.setString(2, password);
        int count = pst.executeQuery().getInt(1);
        boolean isValid = (count >= 1) ? true : false;
        return isValid;
    }

}