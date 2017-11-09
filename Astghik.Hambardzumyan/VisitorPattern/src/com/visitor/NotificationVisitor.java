package com.visitor;

import com.model.AudioNotification;
import com.model.ImageNotification;
import com.model.VideoNotification;

/**
 * Created by astghik.hambardzumya on 08-Nov-17.
 */
public interface NotificationVisitor {

    void visit(ImageNotification imageNotification);
    void visit(VideoNotification videoNotification);
    void visit(AudioNotification audioNotification);
    
}
