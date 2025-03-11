package project_2;

import java.util.*;
public class Doctor extends CareProfessional {
    ArrayList<Patient> doctorsPatients;
    LabScientist labtech;

    public Doctor(int id, String name, int age, int salary, String department, LabScientist labguy){
        super(id, name, age, salary, department);
        this.labtech = labguy;
        System.out.println("Doctor "+ name + " hired!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setPatients(ArrayList<Patient> patients){
        this.doctorsPatients = patients;
    }

    public ArrayList<Patient> getRecords(Dataset myDataset){
        System.out.println( name + " pulling sensitive patient info from database...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myDataset.getSensitivePatientRecords();
        }

    public void orderLabWorkOnPatients(Dataset myDataset){
        System.out.println("Doctor "+ name + " requesting lab work for patients");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        labtech.uploadSensitivePatientInfo(myDataset);
        ArrayList<Patient> analyzedPatients = getRecords(myDataset);
        setPatients(analyzedPatients);

    }

    public int reportHeartAnalysis(String healthAttribute){
        // perform report
        String field = "target";
        ArrayList<Patient> patients_healthy = new ArrayList<Patient>();
        ArrayList<Patient> patients_sick = new ArrayList<Patient>();

        for (Patient patient: doctorsPatients){ // categorize patients
            if ((int)patient.getPatientInfo(field) == 0){
                patients_healthy.add(patient);
            }else{
                patients_sick.add(patient);
            }
        }
        int healthySum = 0;
        int healthyCount = 0;
        int sickSum = 0;
        int sickCount = 0;
        try{
            for (Patient patient : patients_healthy){
                int info = (int)patient.getPatientInfo(healthAttribute);
                healthySum += info;
                healthyCount++;
            }
            for (Patient patient : patients_sick){
                int info = (int)patient.getPatientInfo(healthAttribute);
                sickSum += info;
                sickCount++;
            }
        } catch (NullPointerException e){
            System.out.println("Null pointer exception! Make sure to input one of the health attribute options correctly!");
            return 1;
        }
        System.out.println("Doctor"+ name + " conducting patient analysis on "+ healthAttribute + "...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double healthyAverage = (healthySum/(double)healthyCount);
        double sickAverage = (sickSum/(double)sickCount);

        System.out.printf("After conducting analysis the average %s for those without heart disease is: %.2f and for those with heart disease is: %.2f\n\n",healthAttribute, healthyAverage, sickAverage);
        return 0;
    }


}
