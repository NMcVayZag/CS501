package week_8;

import week_8.Shape8;

public class Rectangle  extends Shape8{

    protected double width; 
    protected double height; 

    public Rectangle()
    {
        width = 4; 
        height = 5;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double w){
        this.width = w;
    }
    public void setHeight(double h){
        this.height = h;
    }
    
    public Rectangle(double h, double w)
    {
        width = w; 
        this.height = h;
    }

    public double Area()
    {
        return this.height * this.width;
    }
    public double Circumference(){
        return ((this.height + this.width)*2);
        }

}
