import java.util.Scanner;
import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Customer> customerList = new ArrayList<>();

        Room roomObj = new Room();
        Reservation reservationObj = new Reservation();
        Payment paymentObj = new Payment();

        Administrator adminAkaun = new Administrator("2007", "Afiq Leo", "0123456789", "admin123", "passadmin", "A01", "Manager");

        System.out.println("=================================");
        System.out.println(" WELCOME TO THE HOTEL RESERVATION ");
        System.out.println("=================================");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Exit");
        System.out.print("Please choose your identity to start: ");
        int identity = input.nextInt();
        input.nextLine();

        if (identity == 1) {
            System.out.println("\n--- ADMIN LOGIN ---");
            System.out.print("Please enter Admin ID: ");
            String inputAdminID = input.nextLine();
            
            System.out.print("Please enter Password: ");
            String inputPassword = input.nextLine();

            if (inputAdminID.equals(adminAkaun.getAdminID()) && adminAkaun.login(adminAkaun.getUsername(), inputPassword)) {
                System.out.println("\nLogin Successful! Welcome Back, " + adminAkaun.getName());
                
                adminMenu(input, adminAkaun, reservationObj, roomObj, customerList); 
            } else {
                System.out.println("\n[Error] Invalid Admin ID or Password!");
            }

        } else if (identity == 2) {
            customerMenu(input, roomObj, reservationObj, paymentObj, customerList);
        }
        
        input.close();
    }

    public static void adminMenu(Scanner input, Administrator admin, Reservation reservationObj, Room roomObj, ArrayList<Customer> customersList) {
        boolean menuNum = true;

        while (menuNum) {
            System.out.print("\n=== ADMIN MENU SECTION ===");
            System.out.print("\n1. Manage Rooms");
            System.out.print("\n2. Make a Booking");
            System.out.print("\n3. View History Booking");
            System.out.print("\n4. Cancel Booking");
            System.out.print("\n5. Generate Report Summary");
            System.out.print("\n6. LogOut\n");

            System.out.print("\nSelect an option: ");
            int menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    admin.manageRooms(roomObj); 
                    break;
                case 2:
                    admin.makeBooking(reservationObj);
                    break;
                case 3:
                    admin.viewHistoryBooking(reservationObj); 
                    break;
                case 4:
                    admin.cancelBooking(reservationObj); 
                    break;
                case 5:
                    admin.generateReport();
                    break;
                case 6:
                    System.out.print("\nLogOut Successfully...");
                    menuNum = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void customerMenu(Scanner input, Room roomObj, Reservation reservationObj, Payment paymentObj, ArrayList<Customer> customersList) {
        boolean menuNum = true;

        while (menuNum) {
            System.out.print("\n=== CUSTOMER MENU SECTION ===");
            System.out.print("\n1. Check Room Availability & Rates");
            System.out.print("\n2. Make a New Room Reservation");
            System.out.print("\n3. Request Add-On Services");
            System.out.print("\n4. Make Payment");
            System.out.print("\n5. View My Personal Booking History");
            System.out.print("\n6. Log Out\n");

            System.out.print("Select an option: ");
            int menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    boolean isAvailable = roomObj.checkAvailability();
                    System.out.println("Room availability status: " + isAvailable);
                    break;
                
                case 2:
                    reservationObj.makeReservation(); 
                    break;
                
                case 3:
                    AddOnService.processAddOnRequest(customersList, input);
                    break;
                
                case 4:
                    paymentObj.processPayment();
                    break;

                case 5:
                    Customer.processHistoryView(customersList, input);
                    break;

                case 6:
                    System.out.println("Logging out...");
                    menuNum = false;
                    break;

                default:
                    break;
            }
        }
    }
}