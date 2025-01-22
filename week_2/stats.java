package week_2;
import java.util.Scanner;
import java.util.ArrayList;

public class stats {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> testScores = new ArrayList<>();
        int numScores = 3;
        for (int i=0; i<numScores; i++){
            System.out.println("Enter in a score from the class");
            int score = keyboard.nextInt();
            testScores.add(score);
        }
        keyboard.close();

        double avg;
        int sum = 0;
        int min = 100;
        int max= 0;

        for(int score : testScores){
            sum = sum + score;
            if (score < min){
                min = score;
            }
            if(score > max){
                max = score;
            }
        }
        avg = (double)(sum/numScores);
        System.out.println("\nThanks for inputing your classes test scores! Here is a summary of the scores for you.");
        System.out.printf("The average of the %d test scores was %.1f percent score\n",numScores,avg);
        System.out.printf("The scores ranged from a minimum of %d to a maximum of %d\n",min, max);

    }
    
}
