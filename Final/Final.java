package Final;

/* myfile.txt is a text file with lines of ints seperated by commas ex:
4,6,8,3,5,7
6,7,8,3,5,2,5,3,5
...
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Final {


public static void main(String [] args) {


String fileName = "myFile.txt";
File myFile;
Scanner myReader = null;
String data;
String [] parts;
int sum = 0;
try{
    myFile = new File(fileName);
    myReader = new Scanner(myFile);
    while (myReader.hasNextLine()) {
        data = myReader.nextLine();
        parts = data.split(",");
        int [] numArray = new int [parts.length];
        for (int i = 0; i < parts.length;)
        numArray[i] = Integer.parseInt(parts[i]);
        System.out.println("The sum of the line is " + sum);
        sum = sum(numArray);
    }
    
    System.out.println("The total sum is " + sum);
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    } finally{
    System.out.println("This code always executes.");
    }
}



public static int sum(int [] myArray)
{
int sum = 0;
for (int n : myArray)
{
sum += n;
}
return sum;
}
}
