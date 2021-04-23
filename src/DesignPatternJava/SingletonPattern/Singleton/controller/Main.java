package DesignPatternJava.SingletonPattern.Singleton.controller;

import java.lang.management.MemoryUsage;

public class Main {
    public static void main(String[] args) {
        MyClass myClass =  MyClass.getInstance();
        myClass.name = "SAMPLE CLASS";
        System.out.println(myClass);
      /*  MyClass myClass1 = MyClass.getInstance();
        System.out.println(myClass);
        System.out.println(myClass1);
        Person person = new Person();
        Person person1 = new Person();
        System.out.println("1ST Person "+person);
        System.out.println("2ND Person "+person1);
*/

    }
}
