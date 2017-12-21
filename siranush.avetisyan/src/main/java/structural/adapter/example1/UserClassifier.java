package designPatterns.structural.adapter.example1;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public class UserClassifier implements Classifier {

    private final User user;

    public UserClassifier(User user) {
        this.user = user;
    }

    public Integer getId() {
        return user.getId();
    }

    public String getName() {
        return user.getFullName();
    }
}
