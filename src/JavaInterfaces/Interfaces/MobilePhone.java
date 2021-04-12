package JavaInterfaces.Interfaces;

public class MobilePhone implements  ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;


    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public MobilePhone() {
        
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("MobilePhone POWER UP  ");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
        System.out.println("NOW RINGING " + phoneNumber + " on MobilePhone");
    }else
        {
            System.out.println("PHONE IS OFF");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("ANSWERING THE MobilePhone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("RING RING MobilePhone");
        }else {
            isRinging = false;
            System.out.println("MOBILE PHONE NOT ON  OR NUMBER IS DEFFERENT");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public void printContacts() {
    }
}




