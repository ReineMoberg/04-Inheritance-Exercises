package se.lexicon.ReineMoberg.model;

public class Motorcycle extends Vehicle {

    private String typeOfMotorcycle;


    public Motorcycle(String licensePlate) {
        super(licensePlate);
        typeOfMotorcycle = "Undefined";
    }

    public Motorcycle(int price, String brand, String color,
                      String licensePlate, int horsePower, String typeOfMotorcycle) {
        super(price, brand, color, licensePlate, horsePower);
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    @Override
    public void drive() {
        System.out.println("I'm driving my " + this.toString() + " and it is fast!");
    }

    public String getTypeOfMotorcycle() {
        return typeOfMotorcycle;
    }

    public void setTypeOfMotorcycle(String typeOfMotorcycle) {
        this.typeOfMotorcycle = this.typeOfMotorcycle;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "typeOfMotorcycle='" + typeOfMotorcycle + '\'' +
                "} " + super.toString();
    }
}
