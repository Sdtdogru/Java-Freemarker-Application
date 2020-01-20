import java.util.List;

public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> role;


    public User(){

    }


    public User(String name, String firstName, String last, String mail, List<String> role) {
        this.userName = name;
        this.firstName = firstName;
        this.lastName = last;
        this.email = mail;
        this.role = role;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "userName='" + userName + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", role=" + role + '}';
    }




}
