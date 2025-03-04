package week_8;

public class Circle extends Shape8{

    float radius;
    public Circle()
    {
        radius = 0;
    }

    public Circle(float r)
    {
        radius = r;
    }

    public double Area()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double Circumference(){
        return Math.PI * this.radius * 2;
    }
    
}