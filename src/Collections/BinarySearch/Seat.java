
package Collections.BinarySearch;

public class Seat implements Comparable<Seat>{
    private final String seatNumber;

    private boolean reserved = false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }


    public String getSeatNumber() {
        return seatNumber;
    }
    public boolean reserved(){
        if(!this.reserved){
            this.reserved = true;
            System.out.println("SEAT " + seatNumber + " reserved");
            return true;
        }else{
            return  false;
        }
    }

    public boolean cancel(){
        if(this.reserved){
            this.reserved = false;
            System.out.println("RESERVAATION FOR SEAT " + seatNumber + " cancelled");
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }
}
