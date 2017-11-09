package com.model;

import com.visitor.NotificationVisitor;

/**
 * Created by astghik.hambardzumya on 08-Nov-17.
 */
public class ImageNotification implements  Notification {

    public String format;
    public int size;

    public ImageNotification(String format, int size) {
        this.format = format;
        this.size = size;
    }

    @Override
    public String getSubject() {
        return "Image Notification";
    }


    @Override
    public void accept(NotificationVisitor visitor) {
        visitor.visit(this);
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
