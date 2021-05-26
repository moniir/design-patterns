package com.company.observer.emailTopic.model;

import com.company.observer.emailTopic.Observer;
import com.company.observer.emailTopic.Subject;

public class EmailTopicSubscriber implements Observer {

    private Subject topic;
    private String name;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null)
            System.out.println(name+" No new message on this topic.");
        else
            System.out.println(name+" Retrieving msg "+msg);
    }

    @Override
    public void setSubject(Subject subject) {
            this.topic = subject;
    }
}
