package com.model;

import com.visitor.NotificationVisitor;

/**
 * Created by astghik.hambardzumya on 08-Nov-17.
 */
public class AudioNotification implements Notification{

    public int length;
    public String author;

    public AudioNotification(int length, String author) {
        this.length = length;
        this.author = author;
    }

    @Override
    public String getSubject() {
        return "Audio Notification";
    }


    @Override
    public void accept(NotificationVisitor visitor) {
        visitor.visit(this);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
