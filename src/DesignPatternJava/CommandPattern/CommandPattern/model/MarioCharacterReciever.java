package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class MarioCharacterReciever {



    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void moveUp() {
        System.out.println(getName() + " jump up!");

    }

    public void moveDown() {
        System.out.println(getName() + " move down!");
    }

    public void moveLeft() {
        System.out.println(getName() + " move left!");
    }

    public void moveRight() {
        System.out.println(getName() + " move right!");
    }

}
