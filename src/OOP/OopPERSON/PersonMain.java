package OOP.OopPERSON;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("RUEL");
        person.setLastName("LACABA");
        person.setAge(20);

        System.out.println("FULL NAME: " + person.getFullName() );
        System.out.println("AGE: " + person.getAge());
        System.out.println("TEEN?: " + person.isTeen());



    }
}