package week_3;

public class Wall {
    private double height;
    private double width;

    public Wall(){
        this.height = 0;
        this.width = 0;
    }
    public double getHeight(){//getter
        return this.height;
    }
    public void setHeight(double h){//setter
        this.height = h;
    }
    public double getWidth(){//getter
        return this.width;
    }
    public void setWidth(double w){//setter
        this.width = w;
    }
    // to do: make a parameterized constructor that will create a object of the class with given attribute values
    //      establish getter and setter for width
    // "this." is not mandatory.
    public double calculateArea(){ // since its part of the class we can get the object attributes with "this"
        return this.width * this.height;
    }
    
}
