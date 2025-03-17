package Final.lastQuestion;
public abstract class Animals{
    protected String name;
    

    public Animals(String name){
        this.name = name;
    };
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public abstract void speak();

    public abstract void play();

    public abstract String toString();

}