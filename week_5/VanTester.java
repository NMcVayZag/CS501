package week_5;

import java.util.ArrayList;

public class VanTester {
    public static void main(String[] args) {
        ArrayList<Pallet> cargo = new ArrayList<Pallet>();
        for (int i=0; i<4; i++){
            cargo.add(new Pallet(5,4,6,"paris",  "london"));
            cargo.add(new Pallet(5,8,4, "New York", "Pennsylvania"));
            cargo.add(new Pallet(6,10,8, "Connecticut", "Maine"));
        }
        for(Pallet p: cargo){
            System.out.println("Pallet id "+ p.getID());
        }

        Van defaultVan  = new Van();
        Van emptyVan = new Van(100, 40);
        Van loadedVan = new Van(100, 4000, cargo);

        if (defaultVan.getRange() == 0 && defaultVan.getCapacity() ==0){
            System.out.println("default constructor pass");
        }else{
            System.out.println("default constructor failed");
        }

        if (emptyVan.getRange() == 100 && emptyVan.getCapacity() ==40){
            System.out.println("emptyVan constructor pass");
        }else {
            System.out.println("emptyVan constructor failed");
        }

        if (loadedVan.getRange()==100 & loadedVan.getCapacity()==4000 && loadedVan.getCargo() != null){
            System.out.println("Parameterized constructor with cargo pass");
        }else {
            System.out.println("Parameterized constructor with cargo fail");
        }

        Pallet myPallet = new Pallet(3,3,3,"philly", "Kansas City");
        if(loadedVan.load(myPallet)){
            System.out.println("print loading pallet into van passed");
        } else {
            System.out.println("Loading of pallet into van failed");
        }
        if(!defaultVan.load(new Pallet(2,2,2,"philly","miami"))){
            System.out.println(" Loading of pallet to van with no space failed - so PASS");
        }else {
            System.out.println("pallet was successfulyy loaded onto a van with no space - so FAIL");
        }
        if(loadedVan.unload(myPallet).compareTo(myPallet)==0){
            System.out.println(" unload existing pallet from van- success");
        }else {
            System.out.println(" unloaded non-existing pallet from van- FAIL");
        }
        if(emptyVan.unload(myPallet)==null){
            System.out.println("unloading a pallet that doesn't exist passed");
        }else{
            System.out.println("unloading a pallet that doesn't exist - FAILED");
        }
    }
    
}
