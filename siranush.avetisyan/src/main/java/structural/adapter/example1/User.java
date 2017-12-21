package designPatterns.structural.adapter.example1;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public class User {

    private final Integer id;
    private final String firstName;
    private final String lastName;

    public User(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return (firstName != null ? firstName + " " : "") + (lastName != null ? lastName : "");
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
