package week_4.lab;

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    // create parameterized constructor
    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    // create getters for attributes
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public double getPrice(){
        return this.price;
    }
    // create object printer method
    public String toString(){
        return (this.year + " " + this.make + " " + this.model + " at a price of $" + this.price);
    }
}

