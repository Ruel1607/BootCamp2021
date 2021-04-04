package OOP.OOPEncapsulation;

public class Main {
    public static void main(String[] args) {
       /* Player player = new Player();
        player.name = "Ruel";
        player.health = 5000;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        player.healthRemaining();

        damage = 500 ;

        player.loseHealth(damage);
        player.healthRemaining();
        damage = 4491 ;

        player.loseHealth(damage);
        player.healthRemaining();*/

        /*EnhancedPlayer player = new EnhancedPlayer("Ruel",100,"Sword");
        System.out.println("HEALTH " + player.getHealth());
        player.loseHealth(100);*/
        PrinterExercise printer = new PrinterExercise(50,true);
        System.out.println("INITIAL PAGE COUNT= " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("PAGES PRINTED WAS= " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());


    }
}
