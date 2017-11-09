package com.visitor;

import com.model.AudioNotification;
import com.model.ImageNotification;
import com.model.VideoNotification;

import java.util.List;

/**
 * Created by astghik.hambardzumya on 09-Nov-17.
 */
public class SMSNotificationVisitor implements NotificationVisitor{

    private List<String> phoneNumbers;

    public SMSNotificationVisitor(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumbers = phoneNumber;
    }

    @Override
    public void visit(ImageNotification imageNotification) {
        sendSMS(imageNotification.getFormat());
    }

    @Override
    public void visit(VideoNotification videoNotification) {
        sendSMS(videoNotification.getYoutubeLink());
    }

    @Override
    public void visit(AudioNotification audioNotification) {
        sendSMS(audioNotification.getAuthor());
    }

    public void sendSMS(String text){
        for(String number : getPhoneNumbers()){
            System.out.println(number + ":" + text);
        }
    }
}

