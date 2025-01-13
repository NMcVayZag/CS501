package week_1;

import java.util.Scanner;

public class LabDiningOut {
    public static void main(String[] args){
        try (Scanner keyboard = new Scanner(System.in)){
            System.out.println("Hi hope your meal was good! I can help split the bill.\n How many friends did you dine with?");
            int people = keyboard.nextInt();
            System.out.println("What was the pre-tax total for the bill?");
            double total = keyboard.nextDouble();
            double tip = (total * 0.2);
            double splitAmount = ((total * 1.07) + tip)/(people+1);
            System.out.println(splitAmount);
            //double percentage signs as % in a formatted string is a special character and must be escaped to avoid error. % marks variable injection. .2f signals rounding to second decimal point
            String message = String.format("Given the total bill and tip of 20%% and 7%% tax. The total divided equally amongst you and your friends should amount to $%.2f each.", splitAmount);
            System.out.println(message);
            }
        }
    }
    

