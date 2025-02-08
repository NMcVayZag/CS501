package week_5;

import java.util.ArrayList;

public class BoatTester {
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

        Boat defaultBoat  = new Boat();
        Boat emptyBoat = new Boat("alphonso",100, 40,50,100);
        Boat loadedBoat = new Boat("davis",100, 4000, 50,100, cargo);

        if (defaultBoat.getRange() == 0 && defaultBoat.getCapacity() ==0 && defaultBoat.getCaptain() =="NA"){
            System.out.println("default constructor pass");
        }else{
            System.out.println("default constructor failed");
        }

        if (emptyBoat.getRange() == 100 && emptyBoat.getCapacity() ==40 && emptyBoat.getCaptain() =="alphonso"){
            System.out.println("emptyBoat constructor pass");
        }else {
            System.out.println("emptyBoat constructor failed");
        }

        if (loadedBoat.getRange()==100 && loadedBoat.getCapacity()==4000 && loadedBoat.getCargo() != null && loadedBoat.getCaptain()=="davis"){
            System.out.println("Parameterized constructor with cargo pass");
        }else {
            System.out.println("Parameterized constructor with cargo fail");
        }

        Pallet myPallet = new Pallet(3,3,3,"philly", "Kansas City");
        if(loadedBoat.load(myPallet)){
            System.out.println("print loading pallet into boat passed");
        } else {
            System.out.println("Loading of pallet into boat failed");
        }
        if(!defaultBoat.load(new Pallet(2,2,2,"philly","miami"))){
            System.out.println(" Loading of pallet to boat with no space failed - so PASS");
        }else {
            System.out.println("pallet was successfulyy loaded onto a van with no space - so FAIL");
        }
        if(loadedBoat.unload(myPallet).compareTo(myPallet)==0){
            System.out.println(" unload existing pallet from boat- success");
        }else {
            System.out.println(" unloaded non-existing pallet from boat- FAIL");
        }
        if(emptyBoat.unload(myPallet)==null){
            System.out.println("unloading a pallet that doesn't exist passed");
        }else{
            System.out.println("unloading a pallet that doesn't exist - FAILED");
        }
    }
    
}
