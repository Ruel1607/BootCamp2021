package JavaArray.ArrayLIstCodeChallengeMobileContacts;

public class NameContact {
    private String name;
    private String contact;

    public NameContact(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public NameContact() {

    }



    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public static NameContact createContact(String name, String phoneNumber) {
        return new NameContact(name, phoneNumber);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

