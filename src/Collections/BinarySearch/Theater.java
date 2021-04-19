package Collections.BinarySearch;

import java.util.*;

public class Theater {
    private final String theaterName;
    public List<Seat> seats  = new ArrayList<>();


    public Theater(String theaterName, int numRows, int seatPerRow) {
        this.theaterName = theaterName;

        int lastRow = 'A' + (numRows -1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1 ; seatNum <= seatPerRow;seatNum++){
                Seat seat = new Seat(row + String.format("%02d", + seatNum));
                seats.add(seat);
            }
        }

    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reservedSeat(String seatNumber) {
       /* Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserved();
        } else {*/


        int low = 0 ;
        int high = seats.size() -1 ;

        while (low <= high){
            System.out.print(".");
            int mid= (low + high) /2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if(cmp < 0 ){
                low = mid + 1;
            }else if (cmp > 0 ){
                high = mid - 1 ;
            }else {
                return seats.get(mid).reserved();
            }

        }

            System.out.println("There is no seat " + seatNumber);
            return false;
        }



       /* for(Seat seat : seats) {
            System.out.print(".");
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if(requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserved();
    }
*/


    public void getSeats() {
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }



}
