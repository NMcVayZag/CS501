package project_2;

public class PatientTester {
    public static void main(String[] args) {
        //Test constructor & getter
        Patient myPatient = new Patient(25, 1, 0, 0, 100, 0, 0, 0, 1);
        int age = (int)myPatient.getPatientInfo("age");
        int chol = (int)myPatient.getPatientInfo("chol");
        if((age==25)&&(chol==100)){
            System.out.println("Patient constructor and getter PASSED");
        }else{
            System.out.println("Patient constructor and getter FAILED");
        }
        //test independent getters
        int sex = myPatient.getSex();
        if (sex==1){
            System.out.println("Patient getSex PASSED");
        }else{
            System.out.println("Patient getSex FAILED");
        }
        int target = myPatient.getTarget();
        if (target==1){
            System.out.println("Patient getTarget PASSED");
        }else{
            System.out.println("Patient getTarget FAILED");
        }



    }
    
}
