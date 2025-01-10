package week_1;
import java.util.Scanner;
public class Paint {
    public static void main(String[] args){

    try (Scanner keyboard = new Scanner(System.in)) {
        System.out.println("Please enter the width of the wall in feet.");
        double width = keyboard.nextDouble();
        System.out.println("Please enter the hieght of the wall in feet.");
        double height = keyboard.nextDouble();
        double area = height * width;
        int paintNeeded = (int)Math.ceil(area/100); //casting the double type of area to a type of int once it is rounded up by ceil 
        System.out.println("For " + area + "sq ft of paint, "+ paintNeeded + " quarts of paint are needed.");
        System.out.println("If you wanted to buy this paint in gallons, you would need " + 
                           paintNeeded/4 + " gallons and " + paintNeeded %4 + " quarts of paint");
    }
    }
}
