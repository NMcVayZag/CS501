package lab_7;

public class Cetaceans {
    protected String[] cetaceanProperties = new String[] {"aquatic", "streamlined bodies", "paddle-like fluke(tail)"};
    protected void getProperties(){
        System.out.println("Cetacean Properties include");
        for (String property:cetaceanProperties){
            System.out.println(property+"\n");
        }
    }
}
