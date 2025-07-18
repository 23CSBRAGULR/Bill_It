package Bill_It.logics.Initiation;

import Bill_It.logics.DataBases.UserDB;

public class Authorization {
    UserDB credentials = new UserDB();
    boolean eligibility = false;

    public Authorization() {
        credentials.start();
    }

    public boolean adminLogin(String username, String password) {
        if (credentials.admins.containsKey(username) && credentials.admins.get(username).equals(password)) {
            eligibility = true;
        }
        return eligibility;
    }

    public boolean staffLogin(String username, String password) {
        if (credentials.staffs.containsKey(username) && credentials.staffs.get(username).equals(password)) {
            eligibility = true;
        }
        return eligibility;
    }

}