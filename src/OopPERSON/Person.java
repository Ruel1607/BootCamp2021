package OopPERSON;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private boolean isTeen;
    private String fullName ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        if(age <=19 ){
        return true;
        }
        else{
            return false;
        }

    }
    public void setTeen(boolean teen) {
            isTeen = teen;
    }

    public String getFullName() {
        return this.name +  " " +  this.lastName;
    }


}
