package se.lexicon.ReineMoberg.model;

public class CarEx4 extends CarBase implements CarColour{

    public CarEx4(String carName) {
        super(carName);
    }

    @Override
    public void colour(String colour) {
        System.out.println("The colour of the car is: " + colour);
    }

    public void methodNotInInterface(){
        System.out.println("This is method in Class but not in Interface");
    }
}
