package JavaArray.ArrayListCode;

import java.util.*;

public class ArrayList {

    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

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
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;


            }
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - TO PRINT CHOICE OPTIONS .");
        System.out.println("\t 1 - TO PRINT LIST OF GROCERY ITEMS");
        System.out.println("\t 2 - TO ADD ITEM TO THE LIST ");
        System.out.println("\t 3 - TO MODIFY AN ITEM IN THE LIST");
        System.out.println("\t 4 - TO REMOVE AN ITEM TO THE LIST");
        System.out.println("\t 5 - TO SEARCH FOR AN ITEM IN THE LIST");
        System.out.println("\t 6 - TO GET LIST");
        System.out.println("\t 7 - TO QUIT TO APPLICATION ");
    }

    public static void addItem() {
        System.out.print("Please ENTER THE GROCERY ITEM :");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem() {
        System.out.print("CURRENT ITEM NAME  :");
        String itemNo = scan.nextLine();

        System.out.print("ENTER NEW NAME OF THE ITEM: ");
        String newItem = scan.nextLine();
        groceryList.modifyGroceryItem(itemNo.toLowerCase().toUpperCase(), newItem.toLowerCase().toUpperCase());
    }

    public static void removeItem() {
        System.out.print("TYPE THE ITEM NAME TO REMOVED: ");
        String itemNo = scan.nextLine();
        groceryList.removeGroceryItem(itemNo.toLowerCase().toUpperCase());

    }

    public static void searchItem() {
        System.out.print("ENTER ITEM NAME: ");
        String search = scan.nextLine();
        if (groceryList.onFile(search.toLowerCase().toUpperCase())) {
            System.out.println("FOUND " + search.toLowerCase().toUpperCase() + " IN THE LIST");
        } else {
            System.out.println(search + " NOT FOUND");
        }
    }

    public static void processArrayList() {
        java.util.ArrayList<String> newArray = new java.util.ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        java.util.ArrayList nxtArray = new java.util.ArrayList<String>(groceryList.getGroceryList());

        String [] arr= new String[groceryList.getGroceryList().size()];
        arr = groceryList.getGroceryList().toArray(arr);

        System.out.println(Arrays.toString(arr));
    }

}
