package com.model;

import com.visitor.NotificationVisitor;

/**
 * Created by astghik.hambardzumya on 08-Nov-17.
 */
public class VideoNotification implements Notification {

    public String youtubeLink;
    public int viewCount;

    public VideoNotification(String youtubeLink, int viewCount) {
        this.youtubeLink = youtubeLink;
        this.viewCount = viewCount;
    }

    @Override
    public String getSubject() {
        return "Video Notification";
    }

    @Override
    public void accept(NotificationVisitor visitor) {
        visitor.visit(this);
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
