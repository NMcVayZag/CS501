import java.util.ArrayList;
public class ShapeDriver {

    public static void main(String[] args) throws InvalidShapeException{

        ArrayList <Shape> myShapes = new ArrayList<Shape>();

        myShapes.add(new Circle(3.5f));
        myShapes.add(new Triangle());
        myShapes.add(new Rectangle()); 
        myShapes.add(new Square(2));

        try {
            myShapes.add(new Triangle(10, 1, 1));
        } catch (InvalidShapeException e) {
            System.out.println(e.getMessage());
        }
        
        for (Shape s : myShapes)
            System.out.println("The area of the " + s.getClass() + " is " + s.Area() + ".");

        Triangle myTriangle = new Triangle(6, 8, 10);
        System.out.println("The perimeter of myTriangle is " + myTriangle.Perimeter());
    }
    
}