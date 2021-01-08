package se.lexicon.ReineMoberg.model;

public interface CarColour {

    void colour(String colour);
    default void defaultMethod(){
        System.out.println("This is default message");
    }
    static void staticMethod(){
        System.out.println("This is static method");
    }

}
