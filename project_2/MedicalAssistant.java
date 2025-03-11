package project_2;
import java.util.*;

public class MedicalAssistant extends CareProfessional{
    Doctor assignedDoctor;
    

    public MedicalAssistant(String name, int id, int age, int salary, String department, Doctor assignedDoctor){
        super(id, name, age, salary, department);
        this.assignedDoctor = assignedDoctor;
    }

    public void assignPatients(){
        ArrayList<Patient> patients = getRecords();
        assignedDoctor.setPatients(patients);
    }

}

