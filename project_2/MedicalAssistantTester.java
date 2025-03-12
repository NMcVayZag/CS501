package project_2;

import java.util.ArrayList;

public class MedicalAssistantTester {
    public static void main(String[] args) {
        
    
        LabScientist derrick = new LabScientist(421, "Derrick", 32, 70000, "Biolab");
        Doctor davis = new Doctor(211, "Davis", 55, 430000, "clinic", derrick);
        Dataset myDataset = new Dataset();

        //Test constructor and doctor getter
        MedicalAssistant MA = new MedicalAssistant(162,"Hannah", 23, 62000, "clinic", davis);
        if (MA.getDoctor().getName().equals("Davis")){
            System.out.println("MA constructor and getDoctor getter PASSED");
        }

        //test uploadGeneralPatientInfo
        MA.uploadGeneralPatientInfo(myDataset);
        ArrayList<Patient> testPatients = MA.getRecords(myDataset);
        for (Patient pat: testPatients){
            if (pat.getChol() == 0){
                System.out.println("MA uploadGeneralPatientInfo Method PASSED");
            } else{
                System.out.println("MA uploadGeneralPatientInfo Method Failed");
            }
            break;
        }

        //test assignPatients
        MA.assignPatients(myDataset);

        ArrayList<Patient> doctorsPatients = davis.getDoctorsPatients();
        for (Patient pat: doctorsPatients){
            if (pat.getChol() == 0){
                System.out.println("MA assignPatients Method PASSED");
            } else{
                System.out.println("MA assignPatients Method FAILED");
            }
            break;
        }
        
        //test setDoctor
        Doctor chris = new Doctor(1, "Chris", 40, 430000, "clinic", derrick);
        MA.setDoctor(chris);
        if(MA.getDoctor().getName().equals("chris")){
            System.out.println("MA setDoctor method PASSED");
        }else{
            System.out.println("MA setDoctor method FAILED");
        }


    }
    
}
