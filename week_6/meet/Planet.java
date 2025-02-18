package week_6.meet;

public class Planet {
    private String name;
    private String sizeInEarths;

    Planet(String name, String sizeInEarths){
        this.name = name;
        this.sizeInEarths = sizeInEarths;
    }

    public String getName(){
        return this.name;
    };
    public String getSizeInEarths(){
        return this.sizeInEarths;
    }
}
