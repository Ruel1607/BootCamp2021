package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class LuigiUpCommand implements Command {



    private LuigiCharacterReciever luigi;

    public LuigiUpCommand(LuigiCharacterReciever luigi) {
        this.luigi = luigi;
    }

    @Override
    public void execute() {
        luigi.moveUp();
    }
}
