package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class LuigiLeftCommand implements Command {


    private LuigiCharacterReciever luigi;

    public LuigiLeftCommand(LuigiCharacterReciever luigi) {
        this.luigi = luigi;
    }

    @Override
    public void execute() {
        luigi.moveLeft();
    }
}