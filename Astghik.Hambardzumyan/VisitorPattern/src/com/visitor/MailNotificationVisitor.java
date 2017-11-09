package com.visitor;

import com.model.User;
import com.model.AudioNotification;
import com.model.ImageNotification;
import com.model.VideoNotification;

import java.util.List;

/**
 * Created by astghik.hambardzumya on 09-Nov-17.
 */
public class MailNotificationVisitor implements NotificationVisitor{

    private List<User> users;

    public MailNotificationVisitor(List<User> user) {
        this.users = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUser(List<User> users) {
        this.users = users;
    }

    @Override
    public void visit(ImageNotification imageNotification) {
        sendMail( imageNotification.getSubject(), String.format("Dear User, Your Image format is %s, and size is %d", imageNotification.getFormat(), imageNotification.getSize()));
    }

    @Override
    public void visit(VideoNotification videoNotification) {
        sendMail(videoNotification.getSubject(), String.format("Dear user, Your Video Youtube link is %s, and views are %d", videoNotification.getYoutubeLink(), videoNotification.getViewCount()));
    }

    @Override
    public void visit(AudioNotification audioNotification) {
        sendMail( audioNotification.getSubject(), String.format("Dear User, Your Audio file author is %s, and length is %d", audioNotification.getAuthor(), audioNotification.getLength()));
    }

    // Send
    public void sendMail( String subject, String text){
        for(User user : getUsers()){
            System.out.println(user.getUserName() + ":" + subject + " " + text);
        }
    }
}
