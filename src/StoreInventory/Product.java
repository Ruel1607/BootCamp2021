package StoreInventory;

public class Product {
    String itemName;
    float price;
    //this is for Variable
    Product(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }


    public float getPrice() {
        return price;
    }



    void list(){
        System.out.println(" : " + itemName + " | " + " Price : " + price);
    }
}