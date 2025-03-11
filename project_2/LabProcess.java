package project_2;
import java.util.*;

public class LabProcess {
    public static void main(String[] args){
        String userCommand = "";

        while(userCommand != "exit"){
        
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Hi user! this program will allow you to investigate the differnces in health attributes between individuals who have heart disease and those who do not\n");
            System.out.println("First however we must run an analysis process in the hospital to get the right patient data for the report");
            while(true){ 
                System.out.println("Please enter \"start\" to begin the process.");
                String commandString = keyboard.nextLine();
                if (commandString.equals("exit")){
                    System.exit(0);
                }else if(!commandString.equals("start")){
                    System.out.println("Please enter a valid command");
                    continue;
                }else{
                    System.out.println("Program starting!");
                    break;
                }
            }
            LabScientist derrick = new LabScientist(421, "Derrick", 32, 70000, "Biolab");
            Doctor davis = new Doctor(211, "Davis", 55, 430000, "clinic", derrick);
            MedicalAssistant hannah = new MedicalAssistant(162,"Hannah", 23, 62000, "clinic", davis);
            Dataset myDataset = new Dataset();

            // collect patient basic info & assign patients to doctor davis
            hannah.uploadGeneralPatientInfo(myDataset);
            hannah.assignPatients(myDataset);
            // doctor davis orders labwork to be done by derrick so that he can conduct an analysis
            davis.orderLabWorkOnPatients(myDataset);

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

            while(userCommand != "exit"){
                System.out.print("Out of the following health attributes above, which one would you like to be analyzed by a doctor providing insights between individuals who have heart disease and those who do not?\n");
                userCommand = keyboard.nextLine();
                if (userCommand.equals("exit")){
                    System.exit(0);
                }
                System.out.printf("You chose to investigate %s\n", userCommand);
                
                int status = davis.reportHeartAnalysis(userCommand);
                if (status != 0){
                    System.out.println("Please retry with valid attribute or input \"exit\" to exit the program.\n\n");
                    continue;
                }
            }
            keyboard.close();
        
        }
    }
}
    




