package JavaInterfaces.InterFacesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private  String name;
    private int hitPoints;
    private int streght;
    private String weapon;

    public Player(String name, int hitPoints, int streght) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.streght = streght;
        this.weapon = "Sword";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStreght() {
        return streght;
    }

    public void setStreght(int streght) {
        this.streght = streght;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", streght=" + streght +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2,"" +this.streght);
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0 ){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.streght = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }
}
