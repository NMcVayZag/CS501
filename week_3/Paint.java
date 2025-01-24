package week_3;
import java.util.Scanner;
public class Paint {
    public static void main(String[] args){
        Wall wallA = new Wall();
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Please enter the width of the wall in feet.");
        wallA.setWidth(keyboard.nextDouble());
        System.out.println("Please enter the hieght of the wall in feet.");
        wallA.setHeight(keyboard.nextDouble());
        keyboard.close();
        double areaA = wallA.calculateArea();
        
        int paintNeeded = (int)Math.ceil(areaA/100); //casting the double type of area to a type of int once it is rounded up by ceil 
        System.out.println("For " + areaA + "sq ft of paint, "+ paintNeeded + " quarts of paint are needed.");
        System.out.println("If you wanted to buy this paint in gallons, you would need " + 
                           paintNeeded/4 + " gallons and " + paintNeeded %4 + " quarts of paint");
        //TODO create wall B using the parameterized constructor and print the area of wallB
        // as user for these details before you construct the wall object
    }
}
