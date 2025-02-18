package week_6.lab;
import java.util.*;

public class trail_practice{

    public static void main(String[] args) {
        ArrayList<String> trails = new ArrayList<String>();
        String[] breaks = new String[10];

        trails.add("park trail");
        breaks[0] = "15th street del mar";

        for (String wave : breaks){
            System.out.println(wave);
        }
        for (String trail : trails){
            System.out.println(trail);
        }


        ArrayList<Integer> numbas = new ArrayList<Integer>();
        numbas.add(37);
        numbas.add(1);
        numbas.add(99);
        
        double mean = calcMean(numbas);
        System.out.println(mean);
    }

    public static double calcMean(ArrayList<Integer> numbas){
        int sum = 0;
        for (int numba: numbas){
            sum+=numba;
        }
        double avg  = sum/numbas.size();
        return avg;
    }
}
