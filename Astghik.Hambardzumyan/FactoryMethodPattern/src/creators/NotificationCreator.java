package creators;

import domain.Notification;
import domain.NotificationType;

/**
 * Created by astghik.hambardzumya on 12-Nov-17.
 */
public interface NotificationCreator {
    Notification createNotification(NotificationType type);
}
