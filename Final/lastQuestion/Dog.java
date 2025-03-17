package Final.lastQuestion;

public class Dog extends Animals {
    private String bark;
    private String favoriteBall;

    Dog(String name, String bark, String favoriteBall){
        super(name);
        this.bark = bark;
        this.favoriteBall = favoriteBall;
    }
    public String getBark(){
        return bark;
    }
    public void setBark(String bark){
        this.bark = bark;
    }
    public String getFavoriteBall(){
        return favoriteBall;
    }
    public void setFavoriteBall(String fav_ball){
        this.favoriteBall = fav_ball;
    }
    public void speak(){
        System.out.println(bark);
    }
    public void play(){
        System.out.println("playing with "+ favoriteBall);
    }
    public String toString() {
        
        return ("this is "+ name + " they go " + bark + ". Their favorite ball is " + favoriteBall +".\n" );
    }
    
    
}
