package project_2;
import java.util.*;

public class LabScientist extends CareProfessional {

    public LabScientist(int id, String name, int age, int salary, String department){
        super(id, name, age, salary, department);
        System.out.println("Lab Scientist "+ name + " hired!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void uploadSensitivePatientInfo(Dataset myDataset){
        System.out.println("Lab Scientist "+ name + " running labwork and medical tests...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String data = myDataset.getData();
        ArrayList<Patient> patients = new ArrayList<Patient>();

        String[] rows = data.split("\n");
        for(String row : rows){
            String[] columns = row.split(",");
            int age = Integer.parseInt(columns[0]);
            int sex = Integer.parseInt(columns[1]);
            int cp = Integer.parseInt(columns[2]);
            int trestbps = Integer.parseInt(columns[3]);
            int chol = Integer.parseInt(columns[4]);
            int fbs = Integer.parseInt(columns[5]);
            int thalach = Integer.parseInt(columns[7]);
            int exang = Integer.parseInt(columns[8]);
            int target = Integer.parseInt(columns[13]);

            Patient patient = new Patient(age, sex, cp, trestbps, chol, fbs, thalach, exang, target);
            patients.add(patient);
            }
        myDataset.setSensitivePatientRecords(patients);
        System.out.println("Lab scientist finished uploading patient records with labwork and testing to database!\n");
    }
    public ArrayList<Patient> getRecords(Dataset myDataset){
        return myDataset.getSensitivePatientRecords();
        }
    }
    
