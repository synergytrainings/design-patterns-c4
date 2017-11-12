package domain;

/**
 * Created by astghik.hambardzumya on 10-Nov-17.
 */
public class User {

    private int id;
    private String name;
    private NotificationType notType;

    public User(int id, String name, NotificationType notType) {
        this.id = id;
        this.name = name;
        this.notType = notType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NotificationType getNotType() {
        return notType;
    }

    public void setNotType(NotificationType notType) {
        this.notType = notType;
    }
}
