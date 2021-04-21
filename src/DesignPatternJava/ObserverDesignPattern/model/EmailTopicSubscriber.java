package DesignPatternJava.ObserverDesignPattern.model;

import DesignPatternJava.ObserverDesignPattern.Interface.Observer;
import DesignPatternJava.ObserverDesignPattern.Interface.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;



    //reference to our Subject Class

    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }


    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this);
        if(msg == null)
            System.out.println(name + " no new messages on this topic");
        else
            System.out.println(name +" RETRIEVING MESSAGE " + msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;

    }
}
