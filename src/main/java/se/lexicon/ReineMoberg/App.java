package se.lexicon.ReineMoberg;

import se.lexicon.ReineMoberg.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //Exercise 1
        /*Car car1 = new Car(20000,"Volvo","Red","CAR 123",
                120,"Hatchback");
        Motorcycle mc1 = new Motorcycle(5000,"Ducati","Red","MC 123",
                130,"Racing");
        Truck truck1 = new Truck(50000,"Scania","White","TRK 123",
                350,"Flatbed");
        car1.drive();
        mc1.drive();
        truck1.drive();*/

        //Exercise 2

        //Exercise 3
        /*IceCream iceCream = new IceCream();
        iceCream.description();
        Chocolate chocolate = new Chocolate();
        chocolate.description();
        Vanilla vanilla = new Vanilla();
        vanilla.description();*/

        //Exercise 4
        CarBase car1 = new CarBase("Volvo");
        CarEx4 car2 = new CarEx4("Saab");
        car2.colour("White");
        CarColour car3 = new CarEx4("Ford");
        car3.colour("Blue");
    }
}
