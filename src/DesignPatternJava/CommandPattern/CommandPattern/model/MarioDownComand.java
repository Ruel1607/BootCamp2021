package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class MarioDownComand implements Command {
    private MarioCharacterReciever mario;

    public MarioDownComand(MarioCharacterReciever mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
       mario.moveDown();
    }
}
