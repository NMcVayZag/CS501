package lab_7;

public class SouthAsianRiverDolphin extends Odontoceti {
    protected String[] southAsianRiverDolphinProperties;
    protected String designation;
    
    public SouthAsianRiverDolphin(){
        super();
        southAsianRiverDolphinProperties= new String[] {
            "Live in a freshwater habitat in river systems",
            "Have extremely poor vision- essentially blind which likely evolved due to the fact they cannot see anyway in the murky water of the rivers", 
            "Have developed a special advanced echolocation ability given their blindness",
            "Communicate via disctinct high-frequency clicks whereas other toothed whales use low-frequency for longer distance communication."};
        designation = "species";
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
        System.out.println("\nSouth Asian River Dolphin Properties include:\n");
        for (String property:southAsianRiverDolphinProperties){
            System.out.println("\t"+property+"\n");
        }
    
    }
    protected String getDesignation(){
        return this.designation;
    }
    
}
