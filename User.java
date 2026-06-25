public abstract class User {
    private String personID;
    private String name;
    private String phoneNumber;
    private String username;
    private String password;

    public User(String personID, String name, String phoneNumber, String username, String password) {
        this.personID = personID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && checkPassword(password);
    }

    public void displayProfile() {
        System.out.println("ID: " + personID);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Username: " + username);
        System.out.println("Role: " + getRole());
    }

    public String toFileRecord() {
        return getRole() + "|" + personID + "|" + name + "|" + phoneNumber + "|" + username + "|" + password;
    }

    public abstract String getRole();
}