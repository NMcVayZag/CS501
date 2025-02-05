package week_4;

import java.util.Random;
import java.util.ArrayList;

public class Weights {
    public static void main(String[] args) {

        Random myRandom = new Random(); 
        ArrayList <Integer> weights = new ArrayList<Integer>(5);
        int sum = 0; 

        for (int i = 0; i < 5; i++){ // specify number of elements in the list to iterate through
            int randomInt = myRandom.nextInt(5) + 1;
            weights.add(randomInt);
            sum += randomInt;
            // sum = sum + randomInt;
            System.out.println("The element is " + randomInt);

        }
        System.out.println("\n\nThe sum is: " + sum);

        sum = 0; 
        for (int i = 0; i <weights.size(); i++){// use the size of the list to iterate correctely through the list
            sum += weights.get(i);
        }
        System.out.println("\n\nThe sum is: " + sum);

        sum = 0; 
        for (int weight : weights){ // use the for each loop to iterate through the list
            sum += weight;
        }
        
        System.out.println("\n\nThe sum is: " + sum);
    }
    
}