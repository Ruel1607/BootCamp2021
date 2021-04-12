/*

import JavaInterfaces.Interfaces.MobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {


        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("ENTER YOUR CHOICE :");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;

                case 1:
                    addContacts();
                    break;
                case 2:
                    mobilePhone.printContacts();
                    break;
                case 3:
                    searchContacts();

                case 4:
                    removeContacts();
                    break;
                case 5:
                    editContacts();
                    break;
                case 6:
                    quit = true;
                    break;


            }
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - TO PRINT CHOICE OPTIONS .");
        System.out.println("\t 1 - TO ADD CONTACT TO THE LIST ");

        System.out.println("\t 2 - TO PRINT CONTACTS ");
        System.out.println("\t 3 - TO SEARCH CONTACTS BY NAME ");
        System.out.println("\t 4 - TO REMOVED CONTACTS ");
        System.out.println("\t 5 - TO EDIT CONTACTS ");
        System.out.println("\t 6 - TO FUCK OFF");


    }

    public static void addContacts() {
        System.out.print("Please ENTER Name :");
        String name = scan.nextLine();
        System.out.print("Please ENTER NUMBER :");
        String number = scan.nextLine();
        mobilePhone.addNameContacts(name.toLowerCase().toUpperCase(),number);
    }

    public static void searchContacts() {
        System.out.print("Please ENTER Name :");
        String name = scan.nextLine();
        if(!mobilePhone.onFile(name.toLowerCase().toUpperCase())) {
            System.out.println("FOUND " + name.toLowerCase().toUpperCase()  + " IN THE LIST");
        }
        else{
            System.out.println(name + " NOT FOUND");
        }
    }
    public static void removeContacts(){
        System.out.print("TYPE THE  NAME TO REMOVED: ");
        String name = scan.nextLine();
        mobilePhone.removeContacts(name.toLowerCase().toUpperCase());

    }
    public static void editContacts(){
        System.out.print("TYPE THE  NAME TO EDIT: ");
        String nameEdit = scan.nextLine();

        System.out.print("ENTER NEW NAME : ");
        String newName = scan.nextLine();
        System.out.print("ENTER NEW NUMBER : ");
        String newNumber = scan.nextLine();
        mobilePhone.editContacts(nameEdit,newName,newNumber);
        }






}




*/
