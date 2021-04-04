package OOP.OopPolymorphism;

public class Movie {
    private String title;

    public String getTitle() {
        return title;
    }

    public Movie(String title) {
        this.title = title;
    }

    public String plot() {
        return "No plot here ";
    }

}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }
    public String plot(){
        return "A SHARK EAT PEOPLE";
    }
}

class IndependenceDay extends  Movie{

    public IndependenceDay() {
        super("INDEPENDENCE DAY");
    }

    @Override
    public String plot() {
        return "ALIENS ATTEMP TO TAKE OVER PLANET";
    }
}


class  MazeRunner extends  Movie{
    public MazeRunner() {
        super("MAZE RUNNER>");
    }

    @Override
    public String plot() {
        return "TRY TO ESCAPE MAZE";
    }

}
class StarWars extends Movie{
    public StarWars() {
        super("STAR WARS");
    }

    @Override
    public String plot() {
        return "IMPERIAL FOCE TRY TO TAKE OVER UNIVERSE";
    }
}
class Forgetable extends  Movie{
    public Forgetable() {
        super("Forgetable");
    }

}





