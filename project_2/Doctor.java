package project_2;
import java.util.*;
public class Doctor extends CareProfessional {
    ArrayList<Patient> doctorsPatients;
    LabScientist labtech;

    public Doctor(String name, int id, int age, int salary, String department, LabScientist labguy){
        super(id, name, age, salary, department);
        this.labtech = labguy;
    }

    public void setPatients(ArrayList<Patient> patients){
        this.doctorsPatients = patients;
    }
    public void orderLabWorkOnPatients(){
        ArrayList<Patient> analyzedPatients = labtech.getRecords();
        setPatients(analyzedPatients);
    }
    public void reportHeartAnalysis(int feature){
        //write on how to get analysis
    }

    
}
