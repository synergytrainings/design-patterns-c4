package creators;

import domain.*;

/**
 * Created by astghik.hambardzumya on 12-Nov-17.
 */
public class ParametrizedNotificationCreator implements NotificationCreator{

    @Override
    public Notification createNotification(NotificationType type) {
        Notification notification;
        switch (type) {
            case SMS:
                notification = new SMSNotification();
                break;
            case FACEBOOK:
                notification = new FBNotification();
                break;
            case MAIL:
                notification = new MailNotification();
                break;
            default:
                throw new IllegalArgumentException(String.format("An \"%s\" argument is not valid.", type));
        }
        return notification;
    }
}
