package week_4.lab;
import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> garage;

    public Garage() {
        garage = new ArrayList<Car>();
    }
    public void addCar(Car car) {
        garage.add(car);
        System.out.println("Congrats on your new whip! " +car.toString() + " was added to garage.");
    }

    public void printGarage() {
        for (Car car : garage) {
            System.out.println(car.toString());
        }
    }
    public double getValue(){
        double totalValue = 0;
        for(Car car: garage){
            totalValue += car.getPrice();
        }
        return totalValue;
    }
    public void removeCar(Car car) {
        garage.remove(car);
        System.out.println(car.toString() + " was removed from garage");
    }

}
