package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class LuigiDownCommand implements Command {


    private LuigiCharacterReciever luigi;

    public LuigiDownCommand(LuigiCharacterReciever luigi) {
        this.luigi = luigi;
    }

    @Override
    public void execute() {
        luigi.moveDown();
    }
}
