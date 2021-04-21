package DesignPatternJava.ObserverDesignPattern;

import DesignPatternJava.ObserverDesignPattern.Interface.Observer;
import DesignPatternJava.ObserverDesignPattern.model.EmailTopic;
import DesignPatternJava.ObserverDesignPattern.model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        //create OBSERVERS

        Observer firstObserver = new EmailTopicSubscriber("FIRST OBSERVER");
        Observer seconfObserver = new EmailTopicSubscriber("SECOND OBSERVER");
        Observer thirdObserver = new EmailTopicSubscriber("THIRD OBSERVER");



        //REGISTEM ONSERVER

        topic.register(firstObserver);
        topic.register(seconfObserver);
        topic.register(thirdObserver);


        //ATTACHING OBSERVER TO SUBJECT


        firstObserver.setSubject(topic);
        seconfObserver.setSubject(topic);
        thirdObserver.setSubject(topic);



        //CHECK FOR UPDATE

        firstObserver.update();

        //PROVIDER / SUBJECT (BROADCASTER)

        topic.postMessage("HELLO SUBSCRIBERS");

        topic.unregister(firstObserver);
        System.out.println("================================");
        topic.postMessage("HELLO SUBSCRIBERS");

    }
}
