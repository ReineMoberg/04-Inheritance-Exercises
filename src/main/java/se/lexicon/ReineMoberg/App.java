package se.lexicon.ReineMoberg;

import se.lexicon.ReineMoberg.model.Car;
import se.lexicon.ReineMoberg.model.Motorcycle;
import se.lexicon.ReineMoberg.model.Truck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //Exercise 1
        Car car1 = new Car(20000,"Volvo","Red","CAR 123",
                120,"Hatchback");
        Motorcycle mc1 = new Motorcycle(5000,"Ducati","Red","MC 123",
                130,"Racing");
        Truck truck1 = new Truck(50000,"Scania","White","TRK 123",
                350,"Flatbed");
        car1.drive();
        mc1.drive();
        truck1.drive();

    }
}
