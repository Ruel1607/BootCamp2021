package LinkedList.DEMO;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "PATEROS");
        addInOrder(placesToVisit, "PASIG");
        addInOrder(placesToVisit, "MAKATI");
        addInOrder(placesToVisit, "TAGUIG");
        addInOrder(placesToVisit, "PASAY");
        addInOrder(placesToVisit, "MANILA");
        addInOrder(placesToVisit, "CAVITE");

        printList(placesToVisit);


        addInOrder(placesToVisit, "CAVITE");
        addInOrder(placesToVisit, "BATANGAS");

        printList(placesToVisit);
        visit(placesToVisit);


     /*   placesToVisit.add(1,"BATANGAS");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

*/


    }

    public static void printList(LinkedList<String> linkedList) {

        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("YOU ARE NOW VISITING " + i.next());
        }
        System.out.println("====================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " IS ALREADY INCLUDED");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty() || cities.getFirst() == ""){
            System.out.println("NO CITIES IN THE ITENERART");
            return;
        }else {
            System.out.println("NOW VISITING " + listIterator.next());
            printMenu();
        }
        while(!quit){
            int action =scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday VACATION IS OVER");
                    quit =true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                    System.out.println("NOW VISITING " + listIterator.next());
                    }else{
                        System.out.println("YOU REACH THE END");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("NOW VISITING " + listIterator.previous());
                    }else{
                        System.out.println("WE ARE AT THE START OF THE LIST");
                        goingForward = true ;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                }
            }
        }


    public static void printMenu(){
        System.out.println("AVAILABLE OPTIONS: \n PRESS");
        System.out.println(" 0 --> TO QUIT");
        System.out.println(" 1 --> TO NEXT CITY");
        System.out.println(" 2 --> TO PREVIOUS CITY");
        System.out.println(" 3 --> TO MENU");

    }


}