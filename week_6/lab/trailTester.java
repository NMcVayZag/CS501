package week_6.lab;

import java.util.Random;

public class trailTester {
    public static void main(String[] args) {
        Integer[][] trails = new Integer[3][100];

        //test trail with zeros
        Integer[] flatTrail = new Integer[100];
        for(int i=0;i<100; i++){
            flatTrail[i] = 0;
        }
        trail.displayGain(flatTrail);
        int gain = trail.getElevationGain(flatTrail);
        if (gain != 0){
            System.out.println("TEST FAILED: trail elevation gain should be zero");
        }else{
            System.out.println("TEST PASSED: trail has zero elevation gain");
        }
        System.out.println("This trail has an elevation gain of "+gain+" meters");

        // test with flowy trail
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
    Integer[] flowTrail = trails[2];
    trail.displayGain(flowTrail);
    int gain2 = trail.getElevationGain(flowTrail);
    if (gain2 != 0){
        System.out.println("TEST FAILED: flow trail elevation gain should be zero");
    }else{
        System.out.println("TEST PASSED: trail has zero elevation gain");
    }
    System.out.println("This trail has an elevation gain of "+gain2+" meters");

    // test random trail
    Random random = new Random();
    for(int i=0; i<100; i++){
        int randomInt = random.nextInt(11) - 5;
        trails[0][i] = randomInt;
    }
    Integer[] randTrail = trails[0];
    trail.displayGain(randTrail);
    int gain3 = trail.getElevationGain(randTrail);
    System.out.println("This trail has an elevation gain of "+gain3+" meters");
    }
    
}
