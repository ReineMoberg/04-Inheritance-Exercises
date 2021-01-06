package se.lexicon.ReineMoberg.model;

public class Truck extends Vehicle{

    private String typeOfTruck;

    public Truck(String licensePlate) {
        super(licensePlate);
        typeOfTruck = "Undefined";
    }

    public Truck(int price, String brand, String color,
                 String licensePlate, int horsePower, String typeOfTruck) {
        super(price, brand, color, licensePlate, horsePower);
        this.typeOfTruck = typeOfTruck;
    }

    @Override
    public void drive() {
        System.out.println("I'm driving my " + this.toString() + " and it is slow!");
    }

    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "typeOfTruck='" + typeOfTruck + '\'' +
                "} " + super.toString();
    }

}
