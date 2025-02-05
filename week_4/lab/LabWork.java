package week_4.lab;
import java.util.Scanner;
public class LabWork {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userString = "";

        while (!userString.equalsIgnoreCase("DONE")) {
            System.out.println("Enter a string");
            userString = keyboard.nextLine();
        }
        
    
    }
}
