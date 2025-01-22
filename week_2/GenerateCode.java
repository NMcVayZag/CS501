package week_2;
/***************************************
 * GenerateCode.java
 * Generates a set of randomish pass phrases
 * based on user input
 * @author Tammy Pirmann
 * @version 1.0
 ****************************************/
import java.util.Scanner;
import java.util.Random;

class GenerateCode {

  public static void main (String args[]){

    Random randGen = new Random();
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to the Code Generator! \n Answer some questions and I will generate a set of codes for your consideration.");

    System.out.println("The name of a loved one: ");
    String lovedOne = keyboard.next(); //Use string method to manipulate
    keyboard.nextLine();
    System.out.println("A favorite item or food: ");
    String favorite = keyboard.next();  
    keyboard.nextLine();
    System.out.println("A memorable place: ");
    String place = keyboard.next(); // use string method to manipulate
    keyboard.nextLine();
    System.out.println("A year you can recall (4 digits): ");
    int year = keyboard.nextInt();  //use mathclass to manipulate
    keyboard.nextLine();

    keyboard.close();

    int number = (randGen.nextInt(8))+2;

    String shortFvrt = favorite.replace('a', ' ');
    shortFvrt = shortFvrt.replace('e', ' ');
    shortFvrt = shortFvrt.replace('i', ' ');
    shortFvrt = shortFvrt.replace('o', ' ');
    shortFvrt = shortFvrt.replace('u', ' ');
    shortFvrt = shortFvrt.replace(" ", "");
    // do manipulation here//
    lovedOne = lovedOne.toUpperCase();
    place = place.substring(1,3);
    year = (int)(Math.random() * year);

    System.out.printf("Code #1: %s%d%s\n", lovedOne, year, shortFvrt);
    System.out.printf("Code #2: %s%d%s\n", shortFvrt, number, place);
    System.out.printf("Code #3: %s%d%s%d\n", lovedOne, number, place, year);
    System.out.printf("Code #4: %d%s%d%s\n", number, place, year, lovedOne);

  }
}