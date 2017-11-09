package com.model;

import com.visitor.NotificationVisitor;

/**
 * Created by astghik.hambardzumya on 08-Nov-17.
 */
public interface Notification {

    void accept(NotificationVisitor visitor);

    String getSubject();

}
