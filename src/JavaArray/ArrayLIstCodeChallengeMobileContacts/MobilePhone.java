package JavaArray.ArrayLIstCodeChallengeMobileContacts;

import com.sun.corba.se.pept.transport.ContactInfo;

import java.util.ArrayList;
import java.util.Collections;

public class MobilePhone {
    private ArrayList<NameContact> contactsList = new ArrayList<NameContact>();


    private boolean addNameContact(NameContact contact1) {
        if(findContact(contact1.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        System.out.println("CONTACT ADDED!");
        contactsList.add(contact1);
        return true;

    }

     /*   System.out.println("NAME : " + contact.getName() + " \n NUMBER: " +  contact.getContact() + " IS ADDED");
            contactsList.add(new NameContact(contact.getName(), contact.getContact()));
    }
*/
    public void printContacts() {
        System.out.println("YOU HAVE: " + contactsList.size() + " TOTAL CONTACTS");
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println((i + 1) + ". NAME: " + contactsList.get(i).getName() + " NUMBER :" + contactsList.get(i).getContact());
        }

    }

    private int findContact(NameContact contact) {
        return this.contactsList.indexOf(contact);
    }
    private int findContact(String contactName) {
        for(int i=0; i<this.contactsList.size(); i++) {
            NameContact contact = this.contactsList.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean onFile(String searchItem) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().equals(searchItem)) {
                return true;
            }
        }
        return false;
    }

    /*public  void removeContacts(String name) {
        int position = findContacts(name);
        if(position >=1 ){
            removeContacts(position);
        }
    }*/
    public void removeContacts(String name) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().equals(name)) ;
            contactsList.remove(i);
            System.out.println("CONTACTS REMOVED");
            break;
        }

    }

    public void editContacts(String nameToEdit, String name, String number) {


        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().equals(nameToEdit)) {
                contactsList.get(i).setName(name);
                contactsList.get(i).setContact(number);
                System.out.println("MODIFIED");
                break;
            }
        }


    }

    private void modifyContacts(int position, String name, String number) {

        contactsList.set(position, new NameContact(name, number));
        System.out.println("Grocery ITEM :" + (position + 1) + " HAS BEEN MODIFIED");

    }

    public void addNameContacts(String name, String number) {
        NameContact name1 = new NameContact();
        name1.setName(name);
        name1.setContact(number);
        addNameContact(name1);
    }
   /* public void modifyContacts(String currentItem ,String newItem){
        int position = findContacts(currentItem);
        if(position >=0 ){
            modifyContacts(position,newItem);
        }
    }
*/
}
