package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class MarioRightCommand implements Command {


    private MarioCharacterReciever mario;

    public MarioRightCommand(MarioCharacterReciever mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveRight();
    }
}
