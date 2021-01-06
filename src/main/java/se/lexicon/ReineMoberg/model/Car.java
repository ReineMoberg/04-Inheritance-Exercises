package se.lexicon.ReineMoberg.model;

public class Car extends Vehicle{

    private String typeOfCar;

    public Car(String licensePlate) {
        super(licensePlate);
        typeOfCar = "Undefined";
    }

    public Car(int price, String brand, String color,
               String licensePlate, int horsePower, String typeOfCar) {
        super(price, brand, color, licensePlate, horsePower);
        this.typeOfCar = typeOfCar;
    }

    @Override
    public void drive() {
        System.out.println("I'm driving my " + this.toString() + " and it is comfy!");
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeOfCar='" + typeOfCar + '\'' +
                "} " + super.toString();
    }

}
