package week_2;
import java.util.Date;
import java.util.Random;

public class dateExample {
    public static void main(String[] args) {
        Date date1 = new Date();  // Initializing 2 Date objects
        Date date2 = date1; 
        //This is two variables referencing the same object MEANING DATE2 is an alias for DATE1
        
        System.out.println("Today is " + date1);
        System.out.println("Now is " + date2);
        //Prints the same value for both
        date1.setTime(24*30*60*60*1000l); // sets date in milliseconds since Jan 1, 1970 
        //changing it from int to long "l" to hold information of big number
        System.out.println("Today is " + date1);
        System.out.println("Now is " + date2);

        long msInYear = 1000*60*60*24*365l;
        date2.setTime(msInYear);
        System.out.println("Today is " + date1);
        System.out.println("Now is " + date2);
        String apple = "Chocolate Chip";
        int b = apple.compareTo("OREO");
        System.out.println(b);
        int target=1;
        System.out.println(target);
        while (target>56 || target<21){
            target = (int)(Math.random()*55.01);
        }
        System.out.println(target);

        int target2 = 1;
        Random randgen = new Random(); 
        target2 = randgen.nextInt(35)+21;
        System.out.println(target2);
        

    }
  

}