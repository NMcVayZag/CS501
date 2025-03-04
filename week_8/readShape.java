package week_8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class readShape {

    public static void main(String[] args) throws InvalidShapeException {

        String fileName = "week_8/shape.txt";
        File myFile;
        Scanner myReader = null;
        ArrayList<Shape8> myShapes =  new ArrayList<Shape8>();

        try {
            myFile = new File(fileName);
            myReader = new Scanner(myFile);
            
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String [] dataArray = data.split(" ");
                if (dataArray[0].equals("Circle")){
                    Circle myCircle = new Circle(Float.valueOf(dataArray[1]));
                    myShapes.add(myCircle);
                } else if(dataArray[0].equals("Triangle")){
                    double side1 = Double.valueOf(dataArray[1]);
                    double side2 = Double.valueOf(dataArray[2]);
                    double side3 = Double.valueOf(dataArray[3]);
                    Triangle myTriangle = new Triangle(side1, side2, side3);
                    myShapes.add(myTriangle);
                } else if (dataArray[0].equals("Rectangle")){
                    double width = Double.valueOf(dataArray[1]);
                    double height = Double.valueOf(dataArray[2]);
                    Rectangle myRectangle = new Rectangle(height, width);
                    myShapes.add(myRectangle);
                } else if (dataArray[0].equals("Square")){
                    Integer side = Integer.valueOf(dataArray[1]);
                    Square mySquare = new Square(side);
                    myShapes.add(mySquare);
                }

            
                System.out.println(data);
            }
            for (Shape8 s: myShapes){
                System.out.println(s.getClass());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (myReader != null)
                myReader.close();
        }

    }

}