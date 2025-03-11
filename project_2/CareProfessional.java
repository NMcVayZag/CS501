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
 

    public ArrayList<Patient> getRecords(Dataset myDataset){
        ArrayList<Patient> patients = myDataset.getGeneralPatientRecords();
        System.out.println(name + " pulling general patient info from database...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return patients;
    
    }
    

    
}