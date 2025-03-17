package Final.lastQuestion;

public class Cat extends Animals {
    private String meow;
    private String favoriteToy;

    Cat(String name, String meow, String favoriteToy){
        super(name);
        this.meow = meow;
        this.favoriteToy = favoriteToy;
    }
    public String getMeow(){
        return meow;
    }
    public void setMeow(String meow){
        this.meow = meow;
    }
    public String getFavoriteToy(){
        return favoriteToy;
    }
    public void setFavoriteToy(String favToy){
        this.favoriteToy = favToy;
    }
    public void speak(){
        System.out.println(meow);
    }
    public void play(){
        System.out.println("Playing with "+ favoriteToy);
    }
    public String toString() {
        
        return ("this is "+ name + " they go " + meow + ". Their favorite toy is " + favoriteToy +".\n" );
    }
    
    
}