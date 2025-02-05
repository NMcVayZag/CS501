package week_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/************************************
 * TestPrep.java
 * Runs a little game involving caffeine
 * @author Tammy Pirmann
 * @version 20210414
 ********************************/

public class TestPrep {
  public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    Random randGen = new Random();
    ArrayList<Cafe> drinks = new ArrayList<Cafe>();
  
    System.out.println("It's time to get ready for midterms!");
    System.out.println("You know you have to be alert for study sessions.");
    System.out.println("Caffeinated beverages from your favorite cafe will work.");
    System.out.println("We all like different drinks, so get ready to enter yours.");
    System.out.println("You will need the name, the mg of caffeine and the price.");
    System.out.println("When you are done, enter DONE then 0 then 0.");
    
    String name = "na";
    int caffeine;
    double price;
    
    while (!name.equalsIgnoreCase("DONE")){
      System.out.println("Enter a drink name or DONE: ");
      name = keyboard.nextLine();
      if (name.equalsIgnoreCase("DONE")){
        break;
      }
      System.out.println("Enter the caffeine in mg: ");
      caffeine = keyboard.nextInt();
      System.out.println("Enter the price: ");
      price = keyboard.nextDouble();
      keyboard.nextLine();
      drinks.add(new Cafe(name, caffeine, price));
      
	 }

    int max = drinks.size();
    System.out.println("total amount of drinks: "+max);
	
    System.out.println("The human body can handle about 500 mg of caffeine before bad things start to happen.");
    System.out.println("You will now play chicken with your drink choices. Try to stay alert without going over.");
    System.out.println("You can DRINK or be DONE");
    System.out.println("The drink will be chosen at random from the ones you entered");
   
    int totalCaffeine = 0;
    String tally = "";
	String choice = "DRINK";
    boolean drank = false;
    while (!choice.equalsIgnoreCase("DONE")){
        if(drank){
        System.out.println("You have had the following drinks(s) " + tally + " which adds up to a total of "+  totalCaffeine + "mg of caffeine.");
        }
	    System.out.println("You can DRINK or be DONE!");
		choice = keyboard.nextLine();
        if(choice.equalsIgnoreCase("DONE")){
            break;
        }
        drank = true;
        Cafe bev = drinks.get(randGen.nextInt(max));
        totalCaffeine += bev.getCaffeine();
        tally += "["+bev.toString() +"] ";
    }

    if (totalCaffeine > 500){
       System.out.println("You lose! You get the jitters and can't remember anything you studied today!");
    } 
    else if (totalCaffeine > 100){
       System.out.println("You win! You stay alert for the whole study session!");
    } 
    else{
       System.out.println("What's this? It's like you didn't play! You fell asleep on your book.");
    }
    System.out.println("You drank: " + tally);
    
  }
}// let the user know what they drank and their total caffeine intake before they decide to be done