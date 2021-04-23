package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class MarioUpCommand  implements Command {


    private MarioCharacterReciever mario;

    public MarioUpCommand(MarioCharacterReciever mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.moveUp();
    }
}
