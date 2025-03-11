package project_2;
import java.util.*;

public class CareProfessional{
    int id;
    String name;
    int age;
    int salary;
    String department;

    public CareProfessional(int id, String name, int age, int salary, String department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
 

    public ArrayList<Patient> getRecords(){
        Dataset myDataset = new Dataset();
        String dataset = myDataset.getData();
        ArrayList<Patient> patients = new ArrayList<Patient>();
            
        // ArrayList<Patient> patients_healthy = new ArrayList<Patient>();
        // ArrayList<Patient> patients_sick = new ArrayList<Patient>();
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
            // if (target == 0){
            //     patients_healthy.add(patient);
            // }else{
            //     patients_sick.add(patient);
            // }
        }
        // ArrayList<ArrayList<Patient>> patients = new ArrayList<ArrayList<Patient>>();
        // patients.add(patients_healthy);
        // patients.add(patients_sick);
        return patients;
    
    }
    

    
}