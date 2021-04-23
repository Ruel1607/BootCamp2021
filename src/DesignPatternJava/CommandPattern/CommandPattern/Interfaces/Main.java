package DesignPatternJava.CommandPattern.CommandPattern.Interfaces;

import DesignPatternJava.CommandPattern.CommandPattern.model.*;

public class Main {
    public static void main(String[] args) {

        MarioCharacterReciever mario = new MarioCharacterReciever();
        mario.setName("Mario");

        //CREATE COMMANDS
        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);
        MarioDownComand marioDownComand = new MarioDownComand(mario);

        //INVOKER
        GameBoyInvoker marioController = new GameBoyInvoker(marioUpCommand,marioDownComand,marioLeftCommand,marioRightCommand);
        marioController.arrowDown();
        marioController.arrowLeft();
        marioController.arrowUp();
        marioController.arrowRight();


        System.out.println("==========================================");

        LuigiCharacterReciever luigi = new LuigiCharacterReciever();
        luigi.setName("Luigi");

        //COMMAND
        LuigiUpCommand luigiUpCommand = new LuigiUpCommand(luigi);
        LuigiDownCommand luigiDownCommand = new LuigiDownCommand(luigi);
        LuigiLeftCommand luigiLeftCommand = new LuigiLeftCommand(luigi);
        LuigiRightCommand luigiRightCommand = new LuigiRightCommand(luigi);


        //INVOKE
        GameBoyInvoker luigiController = new GameBoyInvoker(luigiUpCommand,luigiDownCommand,luigiLeftCommand,luigiRightCommand);

        luigiController.arrowRight();
        luigiController.arrowUp();
        luigiController.arrowLeft();
        luigiController.arrowDown();


    }
}
