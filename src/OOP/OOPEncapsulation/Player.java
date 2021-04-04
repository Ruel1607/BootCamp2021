package OOP.OOPEncapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;


    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("PLAYER KNOCKED OUT");

        }
    }
    public int healthRemaining(){
        System.out.println("HEALTH REMAINING: " + this.health);
       return this.health;
    }


}
