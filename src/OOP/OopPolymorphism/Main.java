package OOP.OopPolymorphism;

public class Main {
    public static void main(String[] args) {

        for(int i = 1 ; i<11; i++){
            Movie movie =  randomMovie();
            System.out.println("MOVIE# " + i + " : " + movie.getTitle() + "\n" + "plot" + movie.plot()+ "\n");

        }

    }

    public static Movie randomMovie(){
        int ramdomNumber = (int) (Math.random()* 5) + 1 ;
        System.out.println("RANDOM NUMBER GENERATED WAS:" + ramdomNumber);
        switch (ramdomNumber){
            case 1 :
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3 :
                return  new Forgetable();

            case 4 :
                return  new MazeRunner();

            case 5:
                return new StarWars();


        }
        return  null;
    }
}
