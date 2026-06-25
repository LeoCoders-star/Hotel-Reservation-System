import java.util.Scanner;
import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Customer> customerList = new ArrayList<>();

        Administrator adminAkaun = new Administrator("P001", "Afiq Leo", "0123456789", "admin123", "passadmin", "A01", "Manager");

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
                adminMenu(input, adminAkaun);
            } else {
                System.out.println("\n[Error] Invalid Admin ID or Password!");
            }

        } else if (identity == 2) {
            System.out.println("\n--- CUSTOMER LOGIN ---");
            System.out.print("Please enter Username: ");
            String inputUsername = input.nextLine();
            
            System.out.print("Please enter Password: ");
            String inputPassword = input.nextLine();

            Customer loggedInCustomer = null;

            for (Customer c : customerList) {
                if (c.login(inputUsername, inputPassword)) {
                    loggedInCustomer = c; 
                    break;
                }
            }

            if (loggedInCustomer != null) {
                System.out.println("\nLogin Successful! Welcome, " + loggedInCustomer.getName());
                customerMenu(input, loggedInCustomer); 
            } else {
                System.out.println("\n[Error] Invalid Username or Password!");
            }

        } else {
            System.out.println("Thank you for using our system.");
        }
        
        input.close();
    }

    public static void adminMenu(Scanner input, Administrator admin) {
    }

    public static void customerMenu(Scanner input, Customer customer) {
        
    }
}