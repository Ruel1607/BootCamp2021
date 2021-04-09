package JavaArray.BankingApp;

import java.sql.SQLOutput;
/*
* WE NEED TO USE AUTOBOXING TO CONVERT PRIMITIVE DATA TYPE TO OBJECT
* THE PRIMITIVE DATA TYPE IS NOT ACCEPTING WHEN WE USE COLLECTION OR DATA STRUCTURE
* EVERYTHING IN JAVA IS AN OBJECT
* No. Autoboxing only applies to primitives -> wrappers.
*  Since there is no String primitive (or wrapper),
* String has nothing to do with autoboxing.
* */


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("BPI");

        if( bank.addBranch("PATEROS")){
            System.out.println("PATEROS BRANCH CREATED");
        }
        bank.addBranch("PATEROS");
        bank.addCustomer("PATEROS","RUEL", 50.10);
        bank.addCustomer("PATEROS","RUTH",20.22);
        bank.addCustomer("PATEROS","TIM",1233.32);


       if( bank.addBranch("MAKATI")){
           System.out.println("MAKATI BRANCH CREATED");
       }
        bank.addCustomer("MAKATI","JOE",123.21);


        bank.addCustomerTransaction("PATEROS", "RUEL", 34.33);
        bank.addCustomerTransaction("PATEROS", "LIZA", 123.21);
        bank.addCustomerTransaction("PATEROS", "TIM", 5433.1);

        bank.listCustomers("PATEROS",true);


        bank.listCustomers("MAKATI",true);

        bank.addBranch("PASIG");
        if(!bank.addCustomer("PASIG","JOHNSON", 2333.221)){
            System.out.println("ERROR PASIG BRANCH DOES NOT EXIST");
        }
        if(!bank.addBranch("PATEROS")){
            System.out.println("PATEROS ALREADY EXIST");
        }
        if(!bank.addCustomerTransaction("PATEROS","JAVA",21.211)){
            System.out.println("CUSTOMER DOES NOT EXIST AT BRANCH");
        }

        if(!bank.addCustomer("PATEROS","RUEL",211.11)){
            System.out.println("CUSTOMER RUEL ALREADY EXIST");
        }

    }

}
