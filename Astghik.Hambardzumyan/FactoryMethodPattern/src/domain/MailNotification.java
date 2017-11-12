package domain;

/**
 * Created by astghik.hambardzumya on 12-Nov-17.
 */
public class MailNotification implements Notification{

    @Override
    public String getNotificationMessage() {
        return "Dear User, This is Mail Notification.";
    }
}
