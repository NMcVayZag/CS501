package project_2;
import java.util.*;

public class CareProfessionalTester {
    public static void main(String[] args) {
        //testing constructor/getters
        CareProfessional myCP = new CareProfessional(24,"cindy",30,70000,"clinic");
        if ((myCP.getAge() == 30)&&(myCP.getDepartment().equals("clinic")&&(myCP.getId()==24)&&(myCP.getSalary()==70000))){
            System.out.println("CareProfessional constructor and getters PASSED");
        }
        //testing seters
        myCP.setId(2);
        myCP.setSalary(50000);
        myCP.setDepartment("ER");
        if ((myCP.getDepartment().equals("ER")&&(myCP.getId()==2)&&(myCP.getSalary()==50000))){
            System.out.println("CareProfessional Setters PASSED");
        }
        //TEST PREP
        LabScientist derrick = new LabScientist(421, "Derrick", 32, 70000, "Biolab");
        Doctor davis = new Doctor(211, "Davis", 55, 430000, "clinic", derrick);
        MedicalAssistant hannah = new MedicalAssistant(162,"Hannah", 23, 62000, "clinic", davis);
        Dataset myDataset = new Dataset();
        hannah.uploadGeneralPatientInfo(myDataset);
        
        //testing getRecords
        ArrayList<Patient> testPatients = myCP.getRecords(myDataset);
        for (Patient pat: testPatients){
            if (pat.getChol() == 0){
                System.out.println("CareProfessional getRecords Method PASSED");
            } else{
                System.out.println("CareProfessional getRecords Method FAILED");
            }
            break;
        }


    }
    
}
