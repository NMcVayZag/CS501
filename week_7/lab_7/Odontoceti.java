package lab_7;

public class Odontoceti extends Cetaceans {
    protected String[] odontocetiProperties;
    protected String designation;
    
    public Odontoceti(){
        super();
        odontocetiProperties = new String[] {
            "known informaly as a Toothed Whale",
            "have conical teeth for catching fish and squid", 
            "use echolocation to find food and navigate"};
        designation = "family of species";
    }
    
    protected void getProperties(){
        System.out.println("Cetacean Properties include:\n");
        for (String property:cetaceanProperties){
            System.out.println("\t"+property+"\n");
        }
        System.out.println("\nOdontoceti Properties include:\n");
        for (String property:odontocetiProperties){
            System.out.println("\t"+property+"\n");
        }
    
    }
}
    

