package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class LuigiRightCommand implements Command {


    private LuigiCharacterReciever luigi;

    public LuigiRightCommand(LuigiCharacterReciever luigi) {
        this.luigi = luigi;
    }

    @Override
    public void execute() {
        luigi.moveRight();
    }
}
