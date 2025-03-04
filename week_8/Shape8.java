package week_8;
import java.util.Random;

abstract class Shape8{
    private int position; 
    abstract double Area();
    abstract double Circumference();

    public Shape8()
    {
        Random myRandom = new Random();
        position = myRandom.nextInt(99) + 1;
    }

    public int getPosition()
    {
        return this.position;
    }

    final public void Move()
    {
        Random myRandom = new Random();
        int r = myRandom.nextInt(6) - 3;
        this.position += r;
    }

    public void Resize()
    {
        return;
    }

    
  
}