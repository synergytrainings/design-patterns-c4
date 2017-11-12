package domain;

/**
 * Created by astghik.hambardzumya on 12-Nov-17.
 */
public class SMSNotification implements Notification {

    @Override
    public String getNotificationMessage() {
        return "Dear User, This is SMS Notification";
    }

}
