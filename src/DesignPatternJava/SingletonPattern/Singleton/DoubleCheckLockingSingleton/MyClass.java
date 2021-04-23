package DesignPatternJava.SingletonPattern.Singleton.DoubleCheckLockingSingleton;

public class MyClass {
     String name ;

    // private static MyClass uniqueInstance = new MyClass();

    private volatile static Singleton uniqueInstance;


    private MyClass() {

    }
  /*  public static  MyClass getInstance(){
    //ADDING THE SYNCHRONIZED KEYWORD MAKES OUR SINGLETON SAFE



      *//*  if(uniqueInstance == null){
            uniqueInstance = new MyClass();
        }*//*


    }*/


}
