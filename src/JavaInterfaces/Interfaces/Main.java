package JavaInterfaces.Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone ruelsPhone ;
        ruelsPhone = new DeskPhone(12321);


        ruelsPhone.powerOn();
        ruelsPhone.callPhone(12321);
        ruelsPhone.answer();
        ruelsPhone.dial(1231211);
        System.out.println("==========================================");


        ruelsPhone = new MobilePhone(12345);
        ruelsPhone.powerOn();
        ruelsPhone.callPhone(12345);
        ruelsPhone.answer();
        ruelsPhone.dial(12321321);



    }
}
