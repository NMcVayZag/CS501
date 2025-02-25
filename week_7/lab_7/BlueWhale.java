package lab_7;

public class BlueWhale extends Mysticeti {
    protected String[] blueWhaleProperties;
    protected String designation; 
    public BlueWhale(){
        super();
        blueWhaleProperties = new String[] {
            "they are the largest animal to ever live on earth -larger than the biggest of dinosaurs",
            "have uniquely powerful low-frequency vocalizations -louder than a jet engine that can be heard from up to 1,000 miles away", 
            "have uniquely high feeding capacity eating up to 10 tons of krill in a day"};
        designation = "species";
    };
    
    protected void getProperties(){
        System.out.println("Cetacean Properties include:\n");
        for (String property:cetaceanProperties){
            System.out.println("\t"+property+"\n");
        }
        System.out.println("\nMysticeti Properties include:\n");
        for (String property:mysticetiProperties){
            System.out.println("\t"+property+"\n");
        }
        System.out.println("\nBlue Whale Properties include:\n");
        for (String property:blueWhaleProperties){
            System.out.println("\t"+property+"\n");
        }
    }
}

