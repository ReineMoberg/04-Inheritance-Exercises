package se.lexicon.ReineMoberg;

import se.lexicon.ReineMoberg.model.*;

import java.util.Arrays;

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
        //Setup
        ChildBook.childBooks[0] = new ChildBook();
        ChildBook.childBooks[0].setAuthor("Markus Lutteman");
        ChildBook.childBooks[0].setCategory("Biography");
        ChildBook.childBooks[0].setTitle("El Choco");
        ChildBook.childBooks[0].setYear(2007);
        ChildBook.childBooks[0].setPages(395);
        ChildBook.childBooks[1] = new ChildBook(297);
        ChildBook.childBooks[1].setAuthor("William Gibson");
        ChildBook.childBooks[1].setCategory("Sci-fi");
        ChildBook.childBooks[1].setTitle("Neuromancer");
        ChildBook.childBooks[1].setYear(2007);
        TeenageBook.teenageBooks[0] = new TeenageBook(305);
        TeenageBook.teenageBooks[0].setAuthor("Douglas Coupland");
        TeenageBook.teenageBooks[0].setCategory("Novel");
        TeenageBook.teenageBooks[0].setTitle("Generation X");
        TeenageBook.teenageBooks[0].setYear(1991);
        TeenageBook.teenageBooks[1] = new TeenageBook();
        TeenageBook.teenageBooks[1].setAuthor("Kody Scott");
        TeenageBook.teenageBooks[1].setCategory("Biography");
        TeenageBook.teenageBooks[1].setTitle("Monster");
        TeenageBook.teenageBooks[1].setYear(1993);
        TeenageBook.teenageBooks[1].setPages(258);
        //Prints arrays directly in two different ways
        Arrays.stream(ChildBook.childBooks).forEach(System.out::println);
        System.out.println(Arrays.toString(TeenageBook.teenageBooks));
        //Prints arrays using get.....Books methods.
        //In this case a class instance is needed to access book arrays
        ChildBook tempObjectChildBook = new ChildBook();
        Arrays.stream(tempObjectChildBook.getChildBooks()).forEach(System.out::println);
        TeenageBook tempObjectTeenageBook = new TeenageBook();
        System.out.println(Arrays.toString(tempObjectTeenageBook.getTeenageBooks()));
        //Search for a book title in teenage book department.
        //In this case a class instance is needed to access book array
        TeenageBook tempObjectTeenageBook2 = new TeenageBook();
        System.out.println((tempObjectTeenageBook2.searchTeenageBook("Generation X")));
        System.out.println((tempObjectTeenageBook2.searchTeenageBook("Java for dummies")));



        //Exercise 3
        /*IceCream iceCream = new IceCream();
        iceCream.description();
        Chocolate chocolate = new Chocolate();
        chocolate.description();
        Vanilla vanilla = new Vanilla();
        vanilla.description();*/

        //Exercise 4

        /*//Prints "This is Volvo"
        CarBase car1 = new CarBase("Volvo");
        //car1.colour("Brown")      //Does not work. CarBase is parent class

        //Prints "This is Saab"
        //"The colour of the car is: White"
        //"This is default message"
        //"This is static method"
        //"This is method in Class but not in Interface"
        CarEx4 car2 = new CarEx4("Saab");
        car2.colour("White");
        car2.defaultMethod();
        //car2.staticMethod();   //Does not work. Can't call interface static method with object name
        CarColour.staticMethod();
        car2.methodNotInInterface();

        //Prints "This is Ford"
        //"The colour of the car is: Blue"
        //CarColour car3 = new CarColour()  //Does not work. Interfaces can't be instantiated
        CarColour car3 = new CarEx4("Ford");
        car3.colour("Blue");
        //car3.methodNotInInterface();  //Does not work without type casting*/

    }
}
