package DesignPatternJava.SingletonPattern.Singleton.DoubleCheckLockingSingleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.name = "Singleton";

        System.out.println(singleton);
    }
}
