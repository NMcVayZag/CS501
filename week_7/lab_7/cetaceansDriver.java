package lab_7;

public class cetaceansDriver {
    public static void main(String[] args) {
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
