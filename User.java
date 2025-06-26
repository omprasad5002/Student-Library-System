// Class to store user information
public class User {
    int userId;
    String userName;

    // Constructor to set user details
    public User(int id, String name) {
        userId = id;
        userName = name;
    }

    // Show user details
    public void showUserDetails() {
        System.out.println("ID: " + userId + " | Name: " + userName);
    }
}
