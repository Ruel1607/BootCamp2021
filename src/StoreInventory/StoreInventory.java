package StoreInventory;

import java.util.*;


public class StoreInventory {


    public static Scanner s = new Scanner(System.in);
    public static ArrayList<Product> products = new ArrayList<Product>();
    public static float price;
    public static String itemName;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Hi! this is My Store Inventory 🙂");
        products.add(new Product("Ligo", 12));
        products.add(new Product("Century Tuna", 33));
        products.add(new Product("Omega Sardines", 23));

        boolean quit = false;
        while (!quit) {

            System.out.println();
            System.out.println("Choose Number Option \n" +
                    "1. Search \n" +
                    "2. Add \n" +
                    "3. Delete " + "\n" +
                    "4. List" + "\n" +
                    "5. Update" + "\n" +
                    "6. Clear" + "\n" +
                    "7. Close\n");


            int chose = s.nextInt();
            s.nextLine();
            switch (chose) {
                case 1:
                    System.out.println("\n\nEnter Product Name: ");
                    String search = s.nextLine();
                    searchName(search);
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    list();
                    break;
                case 5:
                    update();
                    break;
                case 6:
                    clear();
                    break;
                case 7:
                    search();
                    break;
                case 8:
                    quit = true;
                    break;

            }
        }
    }

    private static void search() {
        boolean isFound = false;
        System.out.println("\n\nEnter Product Name: ");
        String search = s.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (search.equalsIgnoreCase(products.get(i).itemName)) {
                System.out.println(products.get(i).getItemName() + "|||" + products.get(i).getPrice());
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("NOT FUCKING FOUND");
        }
    }


    private static void add() {
        System.out.println();
        System.out.println("Enter Product name :");
        itemName = s.nextLine();
        System.out.println();
        System.out.println("Enter Price :");
        price = s.nextInt();
        s.nextLine();
        products.add(new Product(itemName, price));
    }


    public static Product searchName(String search) {
        for (Product p : products) {
            if (p.getItemName().equalsIgnoreCase(search)) {
                System.out.println("ITEM " + p.getItemName() + " || Price : " + p.getPrice());
                return p;
            }
        }
        System.out.println("NOT FOUND");
        return null;


    }

    private static void delete() {
        System.out.println();
        for (int i = 0; i < products.size(); i++) {
            System.out.print("product No. " + (i + 1) + " ");
            products.get(i).list();
        }
        System.out.println();
        System.out.println("Select Product No. : ");
        int delete = s.nextInt() - 1;
        s.nextLine();
        products.remove(delete);
        System.out.println();
        System.out.println("Product No. : " + (delete + 1) + " Deleted Successfully");
        System.out.println();
        for (int i = 0; i < products.size(); i++) {
            System.out.print("product No. " + (i + 1) + " ");
            products.get(i).list();
        }

    }

    private static void list() {
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        System.out.println("All List Items: " + products.size());
        System.out.println();
        for (int i = 0; i < products.size(); i++) {
            System.out.print("product No. " + (i + 1) + " ");
            products.get(i).list();
        }
    }

    private static void update() {
        System.out.println("All List Items: " + products.size());
        System.out.println();
        for (int i = 0; i < products.size(); i++) {
            System.out.print("product No. " + (i + 1) + " ");
            products.get(i).list();
        }
        System.out.println();
        System.out.println("Select Product No. : ");
        int update = s.nextInt() - 1;
        s.nextLine();
        System.out.println();
        System.out.println("Enter Product name: ");
        itemName = s.nextLine();
        System.out.println();
        System.out.println("Enter Price: ");
        price = s.nextInt();
        s.nextLine();
        products.set(update, new Product(itemName, price));
        System.out.println("\nProduct Updated Successfully");
    }

    private static void clear() {
        products.clear();
        System.out.println();
        System.out.println("=============================================");
        System.out.println("Clear data Success!");
    }


}

