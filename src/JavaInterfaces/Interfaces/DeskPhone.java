package JavaInterfaces.Interfaces;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;


    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("NO ACTION TAKE , DESKPHONE ");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("NOW RINGING " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("ANSWERING THE DESK PHONE");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("RING RING DESK PHONE");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}








