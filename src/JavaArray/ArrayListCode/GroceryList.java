package JavaArray.ArrayListCode;

import java.util.ArrayList;

public class GroceryList {


    private ArrayList<String> groceryList = new ArrayList<String>();


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem (String item){
        groceryList.add(item);

    }
    public void printGroceryList(){
        System.out.println("YOU HAVE: " + groceryList.size() + " items in your groceries");
    for(int i =0 ; i<groceryList.size(); i++){
        System.out.println((i+1) + ". " + groceryList.get(i));
    }

    }

    private void modifyGroceryItem(int position , String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery ITEM :" +(position+1) + " HAS BEEN MODIFIED");
    }
    private void removeGroceryItem(int position){

        groceryList.remove(position);
        System.out.println("ITEM REMOVED");


    }
    public int findItem(String searchItem){
       // boolean exist = groceryList.contains(searchItem);

        return groceryList.indexOf(searchItem);
    }
   /* private void modifyGroceryItem(int position , String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery ITEM :" +(position+1) + " HAS BEEN MODIFIED");
    }*/
    public void modifyGroceryItem(String currentItem ,String newItem){
    int position = findItem(currentItem);
        if(position >=0 ){
            modifyGroceryItem(position,newItem);
        }
    }
    public void removeGroceryItem(String item)
    {
        int position = findItem(item);
        if(position >=0 ){
        removeGroceryItem(position);
        }
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
    }
