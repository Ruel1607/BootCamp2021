package Collections.BinarySearch;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater("SM", 8,12);
        List<Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserved();
        if(theater.reservedSeat("A02")){
            System.out.println("PLEASE PAY FOR A02");
        }else {
            System.out.println("SEAT ALREADY RESERVED");
        }
      //  Collections.reverse(seatCopy);
        Collections.shuffle(seatCopy);
        System.out.println("PRIONTING SEAT COPY");
        printList(seatCopy);
        System.out.println("PRINTING THEATER COPY");
        printList(theater.seats);

         Collections.swap(seatCopy,1,10);
        Seat minSeat = Collections.min(seatCopy);
        Seat maxSeat = Collections.max(seatCopy);
        System.out.println("MIN " + minSeat.getSeatNumber());
        System.out.println("MAX " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("PRINTING SORT SEATCOPY");
        printList(seatCopy);


       /* Collections.swap(seatCopy, 1 ,20);
        printList(seatCopy);*/

   /* //  theater.getSeats();
        if (theater.reservedSeat("D13")) {
            System.out.println("PLEASE PAY");
        }
        else{
            System.out.println("SORRY THE SEAT IS TAKEN");
        }*/
      /*  if (theater.reservedSeat("H11")) {
            System.out.println("PLEASE PAY");
        }
        else{
            System.out.println("SORRY THE SEAT IS TAKEN");
        }*/

        }
    public static void printList (List<Seat>list){
        for (Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.print("================================================================================================================================");
        System.out.print("================================================================================================================================");
        System.out.println("================================================================================================================================");


    }
    public static void sortList(List<?extends Seat> list){
        for(int i = 0 ; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list, i ,j);
                }
            }
        }
    }


    }

