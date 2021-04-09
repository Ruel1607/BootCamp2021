package LinkedList.DEMO;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Ruel",43.32);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("BALANCE FOR CUSTOMER " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intLst = new ArrayList<>();
        intLst.add(1);
        intLst.add(3);
        intLst.add(4);

        for(int i = 0 ; i< intLst.size(); i++){
            System.out.println(i + ": " + intLst.get(i));
        }

        intLst.add(1,2);

        for(int i = 0 ; i< intLst.size(); i++){
            System.out.println("\n" + i + ": " + intLst.get(i));
        }
        intLst.remove(1);
        for(int i = 0 ; i< intLst.size(); i++){
            System.out.println("\n" + i + ": " + intLst.get(i));
        }

        Iterator<Integer> i = intLst.iterator();
        while (i.hasNext()){
            System.out.println( i.next());

        }






    }
}