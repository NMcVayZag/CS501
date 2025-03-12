package project_2;
import java.util.*;

public class DatasetTester {
    public static void main(String[] args) {
        System.out.println("PREPPING TESTS: \n\n");
        //test constuctor
        Dataset myTestDataset = new Dataset();

        // testprep//////////////////////////////
        LabScientist derrick = new LabScientist(421, "Derrick", 32, 70000, "Biolab");
        Doctor davis = new Doctor(211, "Davis", 55, 430000, "clinic", derrick);
        MedicalAssistant hannah = new MedicalAssistant(162,"Hannah", 23, 62000, "clinic", davis);

        hannah.uploadGeneralPatientInfo(myTestDataset);
        hannah.assignPatients(myTestDataset);
        davis.orderLabWorkOnPatients(myTestDataset);

        ArrayList<Patient> testSensitivePatients = davis.getRecords(myTestDataset);
        ArrayList<Patient> testGeneralPatients = hannah.getRecords(myTestDataset);
        ////////////////////////////////////////
        
        System.out.println("TESTING: \n\n");
        // test getData method
        String data = myTestDataset.getData();
        if (!data.equals(" ")){
            System.out.println("Dataset getData method PASSED");
        }else{
            System.out.println("Dataset getData method FAILED");
        }

        //test setSensitivePatientRecords
        myTestDataset.setSensitivePatientRecords(testSensitivePatients);
        //test getSensitivePatientRecords
        ArrayList<Patient> sensitvePatients = myTestDataset.getSensitivePatientRecords();
        for (Patient pat: sensitvePatients){
            if (pat.getChol() != 0){
                System.out.println("Dataset getSensitivePatientRecords Method PASSED");
            } else{
                System.out.println("Dataset getSensitivePatientRecords Method FAILED");
            }
            break;
        }

        // test setGeneralPatientRecords
        myTestDataset.setGeneralPatientRecords(testGeneralPatients);
        //test getGeneralPatientRecords
        ArrayList<Patient> generalPatients = myTestDataset.getGeneralPatientRecords();
        for (Patient pat: generalPatients){
            if (pat.getChol() == 0){
                System.out.println("Dataset getGeneralPatientRecords Method PASSED");
            } else{
                System.out.println("Dataset getGeneralPatientRecords Method FAILED");
            }
            break;
        }
        

    }
}