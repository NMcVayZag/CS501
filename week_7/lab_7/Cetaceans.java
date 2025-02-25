package lab_7;

public class Cetaceans {
    protected String[] cetaceanProperties;
    protected String designation;

    public Cetaceans(){
        cetaceanProperties = new String[] {"aquatic", "streamlined bodies", "paddle-like fluke(tail)"};
        designation = "family of species";

    };
    protected void getProperties(){
        System.out.println("Cetacean Properties include");
        for (String property:cetaceanProperties){
            System.out.println(property+"\n");
        }
    }
}
