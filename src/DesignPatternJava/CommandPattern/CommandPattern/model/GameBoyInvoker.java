package DesignPatternJava.CommandPattern.CommandPattern.model;

import DesignPatternJava.CommandPattern.CommandPattern.Interfaces.Command;

public class GameBoyInvoker {
    private Command UpCommand, DownCommand, LeftCommand, RightCommand;


    public GameBoyInvoker(Command upCommand, Command downCommand, Command leftCommand, Command rightCommand) {
        UpCommand = upCommand;
        DownCommand = downCommand;
        LeftCommand = leftCommand;
        RightCommand = rightCommand;
    }

    public void arrowUp() {
        UpCommand.execute();
    }

    public void arrowDown() {
        DownCommand.execute();
    }

    public void arrowLeft() {
        LeftCommand.execute();
    }

    public void arrowRight() {
        RightCommand.execute();
    }

}
