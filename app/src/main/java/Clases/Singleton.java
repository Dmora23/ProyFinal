package Clases;

public class Singleton  {

    private static Singleton INSTANCE = null;

    // other instance variables can be here

    private Singleton() {};

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return(INSTANCE);
    }

    // other instance methods can follow
}
