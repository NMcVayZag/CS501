package week_6.lab;
import java.util.Random;

public class trail {
    public static void main(String[] args){
        Integer[][] trails = new Integer[3][100];
        //create trail A
        Random random = new Random();
        for(int i=0; i<100; i++){
            int randomInt = random.nextInt(11) - 5;
            trails[0][i] = randomInt;
        }

        //create trail B 
        for(int i=0; i<100; i++){
            if ((i)<50){
            trails[1][i] = 1;
        }else{
            trails[1][i] = -1;
        }
        }

        // create trail C
        int counter = 0;
        boolean movingUp = true;
        for(int i=0; i<100; i++){
            if(movingUp==true){
                if (counter == 5){
                    movingUp= false;
                    trails[2][i] = counter;
                    counter--;
                }else{
                trails[2][i] = counter;
                counter++;
                }
            }else{
                if (counter == -5){
                    movingUp=true;
                    trails[2][i] = counter;
                    counter++;
                }else{
                    trails[2][i] = counter;
                    counter--;
                }
            }
        }
        
        for (int i=0; i<3; i++){
            int elevationGain = getElevationGain(trails[i]);
            System.out.println("The elevation gain of trail "+ (i+1) +" is "+ elevationGain +" meters.");

        }
        displayGain(trails[0]);


    }
    public static int getElevationGain(Integer[] trail){
        int endElevation = 0;
        for (Integer measure: trail){
            endElevation +=measure;
        }
        return endElevation;
    }
    public static void displayGain(Integer[] trail){
        int measure =0;
        for (Integer increment: trail){
            measure += increment;
            String trailDisplay= "";
                for (int i=0; i<100; i++){
                    if ((i-49)==measure){
                        trailDisplay =trailDisplay.concat(">");
                    }else{
                        trailDisplay = trailDisplay.concat(" ");
                    }
            }
            System.out.println(trailDisplay);
        }
    }
    
}
