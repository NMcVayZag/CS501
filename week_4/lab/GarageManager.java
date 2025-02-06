package week_4.lab;
import java.util.Scanner;
import java.util.ArrayList;
public class GarageManager {
    public static void main(String[] args) {
        Garage myGarage = new Garage();
        // oh man my garage is empty better get my first car
        Car my4runner = new Car("4runner", "Toyota", 2020, 35300.0);
        // COOOL a new 4runner time to put it in my garage
        myGarage.addCar(my4runner);
        // lets check if its all safe in there
        myGarage.printGarage();
        // I need something a lil fancy for those special occasions
        Car myNewAudi = new Car("RS3", "audi", 2018, 26000);
        myGarage.addCar(myNewAudi);
        // I think I'll put it in the garage next to the 4runner
        // Whats the total value of my garage right now?
        double garageValue = myGarage.getValue();
        System.out.println("The total value of my garage is right now is: $" + garageValue);
        // I like this Audi but I think I'll sell it
        myGarage.removeCar(myNewAudi);
        // check value again
        double garageValueAfterSale = myGarage.getValue();
        System.out.println("The total value of my garage is right now is: $" + garageValueAfterSale);

        


}
}
