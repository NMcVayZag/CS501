package project_2;
import java.util.*;

public class DoctorTester {
    public static void main(String[] args) {
        LabScientist derrick = new LabScientist(421, "Derrick", 32, 70000, "Biolab");
        //Test Constructor && getLabScientist
        Doctor davis = new Doctor(211, "Davis", 55, 430000, "clinic", derrick);
        if ((davis.getName().equals("Davis"))&&(davis.getLabScientist().getName().equals("Derrick"))){
            System.out.println("Doctor constructor & getLabscientist PASSED");
        }else{ 
            System.out.println("Doctor constructor & getLabscientist FAILED");
        }
        // TEST PREP
        MedicalAssistant hannah = new MedicalAssistant(162,"Hannah", 23, 62000, "clinic", davis);
        Dataset myDataset = new Dataset();
        hannah.uploadGeneralPatientInfo(myDataset);
        ArrayList<Patient> testPatients = hannah.getRecords(myDataset);

        // test setPatients & getPatients
        davis.setPatients(testPatients);
        ArrayList<Patient> doctorsPatients = davis.getDoctorsPatients();
        for (Patient pat: doctorsPatients){
            if (pat.getChol() == 0){
                System.out.println("Doctors setPatients & getPatients Methods PASSED");
            } else{
                System.out.println("Doctors setPatients & getPatients Methods PASSED");
            }
            break;
        }

        // test orderLabWorkOnPatients & getRecords
        davis.orderLabWorkOnPatients(myDataset);
        ArrayList<Patient> analyzedPatients = davis.getRecords(myDataset);
        for (Patient pat: analyzedPatients){
            if (pat.getChol() != 0){
                System.out.println("Doctor orderLabWorkOnPatients & getRecords Methods PASSED");
            } else{
                System.out.println("Doctor orderLabWorkOnPatients & getRecords Methods FAILED");
            }
            break;
        }



        
    }
    
}
