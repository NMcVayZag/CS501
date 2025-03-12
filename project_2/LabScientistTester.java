package project_2;
import java.util.*;
public class LabScientistTester {
    public static void main(String[] args) {
        //test constructor 
        LabScientist myLS = new LabScientist(421, "Derrick", 32, 70000, "Biolab");
        if (myLS.getName().equals("Derrick")){
            System.out.println("LabScientist constuctor PASSED");
        }else{
            System.out.println("LabScientist constuctor FAILED");
        }
        //TEST PREP
        Dataset myDataset = new Dataset();

        // test upload SensitivePatientInfo()
        myLS.uploadSensitivePatientInfo(myDataset);

        //test getRecords()
        ArrayList<Patient> testPatients = myLS.getRecords(myDataset);
        for (Patient pat: testPatients){
            if (pat.getChol() != 0){
                System.out.println("LabScientist uploadSensitivePatientInfo & getRecords Methods PASSED");
            } else{
                System.out.println("LabScientist uploadSensitivePatientInfo & getRecords Methods FAILED");
            }
            break;
        }


        
    }
    
}
