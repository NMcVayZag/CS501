package project_2;
import java.util.*;

public class Dataset {
    private String dataset;
    private ArrayList<Patient> generalPatientRecords;
    private ArrayList<Patient> sensitivePatientRecords;

    public Dataset(){
        System.out.println("Database Initializing...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.dataset = "66,1,0,160,228,0,0,138,0,2.3,2,0,1,1\n"+
        "71,0,0,112,149,0,1,125,0,1.6,1,0,2,1\n"+
        "64,1,3,170,227,0,0,155,0,0.6,1,0,3,1\n"+
        "66,0,2,146,278,0,0,152,0,0,1,1,2,1\n"+
        "39,0,2,138,220,0,1,152,0,0,1,0,2,1\n"+
        "58,0,0,130,197,0,1,131,0,0.6,1,0,2,1\n"+
        "47,1,2,130,253,0,1,179,0,0,2,0,2,1\n"+
        "35,1,1,122,192,0,1,174,0,0,2,0,2,1\n"+
        "58,1,1,125,220,0,1,144,0,0.4,1,4,3,1\n"+
        "56,1,1,130,221,0,0,163,0,0,2,0,3,1\n"+
        "56,1,1,120,240,0,1,169,0,0,0,0,2,1\n"+
        "55,0,1,132,342,0,1,166,0,1.2,2,0,2,1\n"+
        "41,1,1,120,157,0,1,182,0,0,2,0,2,1\n"+
        "38,1,2,138,175,0,1,173,0,0,2,4,2,1\n"+
        "67,1,0,160,286,0,0,108,1,1.5,1,3,2,0\n"+
        "67,1,0,120,229,0,0,129,1,2.6,1,2,3,0\n"+
        "62,0,0,140,268,0,0,160,0,3.6,0,2,2,0\n"+
        "63,1,0,130,254,0,0,147,0,1.4,1,1,3,0\n"+
        "53,1,0,140,203,1,0,155,1,3.1,0,0,3,0\n"+
        "56,1,2,130,256,1,0,142,1,0.6,1,1,1,0\n"+
        "48,1,1,110,229,0,1,168,0,1,0,0,3,0\n"+
        "58,1,1,120,284,0,0,160,0,1.8,1,0,2,0\n"+
        "58,1,2,132,224,0,0,173,0,3.2,2,2,3,0\n"+
        "60,1,0,130,206,0,0,132,1,2.4,1,2,3,0\n"+
        "40,1,0,110,167,0,0,114,1,2,1,0,3,0\n"+
        "60,1,0,117,230,1,1,160,1,1.4,2,2,3,0\n"+
        "64,1,2,140,335,0,1,158,0,0,2,0,2,0\n"+
        "43,1,0,120,177,0,0,120,1,2.5,1,0,3,0\n"+
        "57,1,0,150,276,0,0,112,1,0.6,1,1,1,0\n"+
        "55,1,0,132,353,0,1,132,1,1.2,1,1,3,0";
    }
    public String getData(){
        return this.dataset;
    }
    public void setSensitivePatientRecords(ArrayList<Patient> patients){
        this.sensitivePatientRecords = patients;
    }
    public ArrayList<Patient> getSensitivePatientRecords(){
        return this.sensitivePatientRecords;
    }

    public void setGeneralPatientRecords(ArrayList<Patient> patients){
        this.generalPatientRecords = patients;
    }
    public ArrayList<Patient> getGeneralPatientRecords(){
        return this.generalPatientRecords;
    }


    
}
