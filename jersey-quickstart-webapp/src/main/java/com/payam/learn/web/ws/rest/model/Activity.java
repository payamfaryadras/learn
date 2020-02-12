package com.payam.learn.web.ws.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Activity {
    private String description;
    private int duration;
   private String id;
   private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Activity(String description, int duration) {
        this.duration = duration;
        this.description = description;
    }
    public Activity(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
