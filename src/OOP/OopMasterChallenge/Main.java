package OOP.OopMasterChallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger burger = new Hamburger("Floppy", "BEEF", 90);
        burger.addCarrots();
        burger.addLettuce();
        burger.addTomato();
        burger.totalPayment();

        HealthyBurger hlthyBuger = new HealthyBurger("Muffin roll", "PORK", 110);
        hlthyBuger.addDefault();
        hlthyBuger.addExtraMayonaise();
        hlthyBuger.addExtraPatty();
        hlthyBuger.addExtraPatty();
        hlthyBuger.addExtraPatty();


        System.out.print("YOUR GRAND TOTAL PAYMENT IS: ");
        System.out.println( hlthyBuger.getPrice() + burger.getPrice());


    }
}
