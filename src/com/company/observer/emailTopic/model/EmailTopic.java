package com.company.observer.emailTopic.model;

import com.company.observer.emailTopic.Observer;
import com.company.observer.emailTopic.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {

    private List<Observer> observerList;
    private String message;

    public EmailTopic() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null) throw new NullPointerException("Null object");
        if(!observerList.contains(observer))
            observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(item-> item.update());

    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message){
        System.out.println("message posted to my topic "+message);
        this.message = message;
        notifyObservers();
    }
}
