package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class MarioLeftCommand implements Command {


    private MarioCharacterReciever mario;

    public MarioLeftCommand(MarioCharacterReciever mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveLeft();
    }
}
