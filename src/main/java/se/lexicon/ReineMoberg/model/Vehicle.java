package se.lexicon.ReineMoberg.model;


import java.text.NumberFormat;
import java.util.Locale;

public abstract class Vehicle {

    private int price;
    private String brand;
    private String color;
    private String licensePlate;
    private int horsePower;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        price = 0;
        brand = "Undefined";
        color = "Undefined";
        horsePower = 0;
    }

    public Vehicle(int price, String brand, String color, String licensePlate, int horsePower) {
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.horsePower = horsePower;
    }

    public abstract void drive();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + NumberFormat.getCurrencyInstance(new Locale("en","us")).format(price) +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

}
