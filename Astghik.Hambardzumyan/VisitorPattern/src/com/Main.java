package com;

import com.model.*;
import com.visitor.MailNotificationVisitor;
import com.visitor.SMSNotificationVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by astghik.hambardzumya on 09-Nov-17.
 */
public class Main {
    public static void main( String[] args ) {
        Notification[] notifications = {new ImageNotification("png",8),
                                        new AudioNotification(3,"Smile"),
                                        new VideoNotification("https://www.youtube.com/watch?v=4ofsxnGmhMw&feature=share", 105)};

        List<User> users = new ArrayList<>();
        users.add(new User(1,"Astghik"));
        users.add(new User(2,"Lilit"));
        List<String> numbers = new ArrayList<>();
        numbers.add("095311125");
        numbers.add("094311125");

        MailNotificationVisitor mailVisitor = new MailNotificationVisitor(users);
        SMSNotificationVisitor smsVisitor = new SMSNotificationVisitor(numbers);

        for (Notification not : notifications) {
            not.accept(mailVisitor);
        }
        for (Notification not : notifications) {
            not.accept(smsVisitor);
        }
    }
}
