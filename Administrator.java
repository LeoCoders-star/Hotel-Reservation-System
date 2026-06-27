import java.util.ArrayList;

public class Administrator extends User {

    private String adminID;
    private String adminRole;
    private boolean isAuthenticated;

    public Administrator(String personID, String name, String phoneNumber, String username, String password,
                         String adminID, String adminRole){

        super(personID, name, phoneNumber, username, password);
        this.adminID = adminID;
        this.adminRole = adminRole;
        this.isAuthenticated = false;
    }

    @Override
    public String getRole() {
        return "Administrator";
    }

    public boolean adminAuthentication(String securityKey) {
        if ("MASTER_KEY_2026".equals(securityKey)) {
            this.isAuthenticated = true;
            return true;
        }
        return false;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    public String getAdminID() {
        return adminID;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public String toString() {
        return "ID: " + getPersonID() + ", Name: " + getName() +
                ", Admin ID: " + adminID + ", Role: " + adminRole +
                ", Authenticated: " + isAuthenticated;
    }

    public void manageRooms() {

    }

    public void makeBooking() {

    }

    public void viewHistoryBooking() {

    }

    public void cancelBooking() {

    }

    public void generateReport() {
        
    }
}