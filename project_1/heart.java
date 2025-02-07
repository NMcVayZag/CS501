package project_1;
import java.lang.reflect.Array;
import java.util.*;

public class heart {
    public static void main(String[] args){
        ArrayList<ArrayList<Patient>> patients = getPatients();
        ArrayList<Patient> patients_healthy = patients.get(0);
        ArrayList<Patient> patients_sick = patients.get(1);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hi user this program will allow you to investigate the differnces in health attributes between individuals who have heart disease and those who do not\n");
        System.out.println("Health attributes available for analysis include:");
        System.out.println("1. age - Age of the individual\n");
        System.out.println("2. sex - sex");
        System.out.println("\t* 1= male, 0 = Female\n");
        System.out.println("3. cp - Chest pain type");
        System.out.println("\t* 0= typical angina, 1= atypical angina, 2= non-anginal pain, 3= asymptomatic\n");
        System.out.println("4. trestbps - Resting blood pressure (in mm Hg)\n");
        System.out.println("5. chol - Serum cholestoral in mg/dl\n");
        System.out.println("6. fbs - Fasting blood sugar > 120 mg/dl");
        System.out.println("\t* 1= true, 0= false\n");
        System.out.println("7. thalach - Maximum heart rate achieved\n");
        System.out.println("8. exang - Exercise induced angina");
        System.out.println("\t* 1= yes, 0= no\n");

        System.out.print("Out of the following health attributes above, which one would you like to analyze between individuals who have heart disease and those who do not?\n");
        String healthAttribute = keyboard.nextLine();
        System.out.printf("%s\n", healthAttribute);
        int healthySum = 0;
        int healthyCount = 0;
        int sickSum = 0;
        int sickCount = 0;

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
        double healthyAverage = (healthySum/healthyCount);
        double sickAverage = (sickSum/sickCount);

        System.out.printf("After conducting analysis the average %s for those without heart disease is: $.2f and for those with health disease is: $.2f",healthAttribute, healthyAverage, sickAverage);

    }



    public static ArrayList<ArrayList<Patient>> getPatients(){
        String csvData = "66,1,0,160,228,0,0,138,0,2.3,2,0,1,1\n"+
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

        ArrayList<Patient> patients_healthy = new ArrayList<Patient>();
        ArrayList<Patient> patients_sick = new ArrayList<Patient>();
        String[] rows = csvData.split("\n");
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
            if (target == 0){
                patients_healthy.add(patient);
            }else{
                patients_sick.add(patient);
            }
        }
        ArrayList<ArrayList<Patient>> patients = new ArrayList<ArrayList<Patient>>();
        patients.add(patients_healthy);
        patients.add(patients_sick);
        return patients;
    
    }
}
