import creators.*;
import domain.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by astghik.hambardzumya on 10-Nov-17.
 */
public class Main {

        public static void main(String []args) {

            NotificationCreator creator = new ParametrizedNotificationCreator();

            List<User> users = new ArrayList<>();
            users.add(new User(1,"Astghik", NotificationType.FACEBOOK));
            users.add(new User(2,"Anahit", NotificationType.MAIL));
            users.add(new User(3,"Arevik", NotificationType.SMS));


            for(User user: users) {
                System.out.println(creator.createNotification(user.getNotType()).getNotificationMessage());
            }


        }

}
