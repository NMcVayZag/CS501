package project_2;
import java.util.*;

public class MedicalAssistant extends CareProfessional{
    Doctor assignedDoctor;

    public MedicalAssistant(int id, String name, int age, int salary, String department, Doctor assignedDoctor){
        super(id, name, age, salary, department);
        this.assignedDoctor = assignedDoctor;
        System.out.println("MA "+ name + " hired!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void uploadGeneralPatientInfo(Dataset myDataset){
            String dataset = myDataset.getData();
            ArrayList<Patient> patients = new ArrayList<Patient>();
            
            String[] rows = dataset.split("\n");
            for(String row : rows){
                String[] columns = row.split(",");
                int age = Integer.parseInt(columns[0]);
                int sex = Integer.parseInt(columns[1]);
                int cp = 0;
                int trestbps = 0;
                int chol = 0;
                int fbs = 0;
                int thalach = 0;
                int exang = 0;
                int target = Integer.parseInt(columns[13]);
                Patient patient = new Patient(age, sex, cp, trestbps, chol, fbs, thalach, exang, target);
                patients.add(patient);
            }
            myDataset.setGeneralPatientRecords(patients); // upload basic patient records to database

            System.out.println("MA "+ name + " collecting basic info of patients...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    public void assignPatients(Dataset myDataset){
        ArrayList<Patient> patients = getRecords(myDataset); // geting general patient info from database
        assignedDoctor.setPatients(patients); // assigning doctor patients with general patient info
        System.out.println("MA "+ name + " assigning patients to doctor " + assignedDoctor.getName() +"...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public Doctor getDoctor(){
        return this.assignedDoctor;
    }
    public void setDoctor(Doctor doctor){
        this.assignedDoctor = doctor;
    }

}

