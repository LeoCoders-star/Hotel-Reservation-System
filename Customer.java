import java.util.ArrayList;

public class Customer extends User {
    private String customerID;
    private String membershipStatus;

    private ArrayList<Reservation> reservations;

    public Customer(String personID, String name, String phoneNumber, String username, String password,
                    String customerID, String membershipStatus) {

        super(personID, name, phoneNumber, username, password);
        this.customerID = customerID;
        this.membershipStatus = membershipStatus;
        this.reservations = new ArrayList<Reservation>();
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    public void setCustomerInfo(String name, String phoneNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void viewHistoryBooking() {
        System.out.println("\n--- Booking History for " + getName() + " (ID: " + customerID + ") ---");
        if (reservations.isEmpty()) {
            System.out.println("No reservation records found.");
            return;
        }

        for (int i = 0; i < reservations.size(); i++) {
            System.out.println("\nRecord " + (i + 1));
            System.out.println(reservations.get(i).toString());
        }
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public String toString() {
        return "ID: " + getPersonID() + ", Name: " + getName() +
                ", Customer ID: " + customerID + ", Membership: " + membershipStatus;
    }
}