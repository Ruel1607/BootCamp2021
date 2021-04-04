package OOP.OopMasterChallenge;

public class Hamburger {
    private String rollType;
    private String meat;
    private int price ;

    public int getPrice() {
        return price;
    }

    private final String name = "BILL'S SPECIAL BURGER";

    private String getName() {
        System.out.println("THANKS FOR ORDERING : " + this.name);
        return name;
    }
    public int Add(int add){
        return this.price += add;
    }

    public Hamburger(String rollType, String meat , int price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }


    public int totalPayment(){

        System.out.println("YOUR TOTAL PAYMENT AND FOR ADDITION IS: " + this.price);
        return this.price = price;
    }
    public int addLettuce(){
       int lettucePrice = 10;
        System.out.println("YOU ADD LETTUCE IN YOUR ORDER");

        return this.price += lettucePrice;
    }
    public int addTomato(){
        int tomatoPrice =  8 ;
        System.out.println("YOU ADD TOMATO IN YOUR ORDER");
        return this.price += tomatoPrice;
    }
    public int addCarrots(){
        int carrotsPRice = 7 ;
        System.out.println("YOU ADD CARROTS IN YOUR ORDER");

        return this.price += carrotsPRice;

    }




}
