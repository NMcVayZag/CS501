package lab_7;

public class Mysticeti extends Cetaceans {
    protected String[] mysticetiProperties = new String[] {
        "known informaly as a Baleen Whale",
        "have Keratinous, filert-feeding plates to trap prey inside their mouths", 
        "have fused neck vertebrae and unable to turn their heads at all"};
    
    protected void getProperties(){
        System.out.println("Cetacean Properties include:\n");
        for (String property:cetaceanProperties){
            System.out.println("\t"+property+"\n");
        }
        System.out.println("\nMysticeti Properties include:\n");
        for (String property:mysticetiProperties){
            System.out.println("\t"+property+"\n");
        }
    
    }
}