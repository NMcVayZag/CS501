
public class RectangleTester {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        if (myRectangle.getWidth()==4 && myRectangle.getHeight()==5){
            System.out.println("Default Contructor PASS");
        }else{
            System.out.println("Default constructor FAILED");
        }
        Rectangle myCustomRectangle =  new Rectangle(10, 5);
        if (myCustomRectangle.getWidth()==5 && myCustomRectangle.getHeight()==10){
            System.out.println("Parameterized Contructor PASS");
        }else{
            System.out.println("Parameterized constructor FAILED");
        }
        if (myCustomRectangle.Area()==50){
            System.out.println("Area method PASS");
        }else{
            System.out.println("Area method FAILED");
        }
        if (myCustomRectangle.Circumference()==30){
            System.out.println("Circumference method PASS");
        }else{
            System.out.println("Circumference method FAILED");
        }

        myCustomRectangle.setHeight(2000);
        myCustomRectangle.setWidth(34);
        if (myCustomRectangle.getWidth()==34 && myCustomRectangle.getHeight()==2000){
            System.out.println("Setters PASS");
        }else{
            System.out.println("Setters FAILED");
        }

        int origPosition = myCustomRectangle.getPosition();
        System.out.println("The position of my Rectangle is "+ myCustomRectangle.getPosition());
        myCustomRectangle.Move();
        System.out.println("The position of my Rectangle is "+ myCustomRectangle.getPosition());
        if (myCustomRectangle.getPosition()!= origPosition){
            System.out.println("Move method & Position method PASSED");
        } else{
            System.out.println("Move OR position method FAILED");
        }


    }
    
}
