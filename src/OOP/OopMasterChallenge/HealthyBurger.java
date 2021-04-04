package OOP.OopMasterChallenge;
public class HealthyBurger extends Hamburger {


    public HealthyBurger(String rollType, String meat, int price) {
        super(rollType, meat, price);
    }

    @Override
    public int totalPayment() {
        return super.totalPayment();
    }

    public void addDefault(){
        System.out.println("DELUXE BURGER ****************************");
        super.addLettuce();
       super.addCarrots();
       super.addTomato();
       super.totalPayment();
    }



    public int addExtraMayonaise() {
        System.out.println("YOU ADD MAYONNAISE");
        return super.Add(7);
    }
    public int addExtraPatty(){
        System.out.println("YOU ADD PATTY");
        return  super.Add(15);
    }
    public int grandTotal ( ) {
        System.out.println(this.getPrice() + super.totalPayment());

        return this.getPrice() + super.getPrice();
    }

}
