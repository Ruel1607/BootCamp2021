package DesignPatternJava.SingletonPattern.Singleton.DoubleCheckLockingSingleton;

public class Singleton {

    private volatile static Singleton uniqueInstance;
    String name ;

    private Singleton() {

    }
    //DOUBLE CHECK LOCKING
    public static Singleton getInstance(){

        if(uniqueInstance == null){
            synchronized ((Singleton.class)){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
