package lab_7;

public class cetaceansDriver {
    public static void main(String[] args) {
        System.out.println("\nHere is a brief breakdown of the aquatic Cetacean famliy species with two descendant families and a species from each of those descendant families\n");

        
        Cetacean animal;
        animal = new Cetacean();
        System.out.println("Animal variable is currently referencing the Cetacean which is a "+ animal.getDesignation()+"\n");
        animal.getProperties();

        animal = new Odontoceti();
        System.out.println("Animal variable is currently referencing the Odontoceti which is a "+ animal.getDesignation()+"\n");
        animal.getProperties();

        animal = new SouthAsianRiverDolphin();
        System.out.println("Animal variable is currently referencing the South Asian River Dolphin which is a "+ animal.getDesignation()+"\n");
        animal.getProperties();

        animal = new Mysticeti();
        System.out.println("Animal variable is currently referencing the Mysticeti which is a "+ animal.getDesignation()+"\n");
        animal.getProperties();

        animal = new BlueWhale();
        System.out.println("Animal variable is currently referencing the Mysticeti which is a "+ animal.getDesignation()+"\n");
        animal.getProperties();

        
    }
    
}
