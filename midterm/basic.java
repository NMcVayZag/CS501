package midterm;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number for how big you want your triangle to be: ");
        int triangleSize = keyboard.nextInt();
        if (triangleSize < 1){
            System.out.println("Make sure to enter a number big enough to form a triangle!");
            System.exit(0);
        }
        for (int i=triangleSize; i>0; i--){
            for (int starCount=0; starCount<i; starCount++){
                System.out.print("*");
            }
            System.out.println();
        }
        keyboard.close();
    }
    
}
