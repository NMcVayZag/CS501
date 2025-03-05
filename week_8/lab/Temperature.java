package week_8.lab;

import java.util.*;

public class Temperature{
    public static void insertionSort(int [] a) //big O(n^2) two loops
    {
        for (int i = 1; i <a.length; i++)
        {
            int key = a[i];
            int position = i;
            while (position > 0 && key < a[position-1])
            {
                a[position] = a[position-1];
                position--;
            }
            a[position]= key;
        }
    }

    public static void main(String[] args){
        int [] dayTemps = {45,47,42,41,39,36,37,41,43,47,48,52,52,56,57,55,51,46,42,44,42,33,35,40};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nHi user please provide two ints from range 0-24(military hours) and I will fetch an average temp between those times");
        System.out.println("\tfirst int please:");
        int start = keyboard.nextInt();

        System.out.println("\tsecond int please:");
        int end = keyboard.nextInt();
        keyboard.close();
        try{
            int sum =0;
            for(int i = start; i < end; i++){
                sum += dayTemps[i-1];
            }
            double average = sum/(end-start);
            System.out.println("The average temp between hour "+ Integer.toString(start) + " and hour "+ Integer.toString(end)+" was "+ Double.toString(average)+ " degrees.");
        insertionSort(dayTemps);
        //System.out.println("Sorted temp list"+ Arrays.toString(dayTemps));
        System.out.println("Lowest temp today was " + Integer.toString(dayTemps[0]));
        System.out.println("Highest temp today was " + Integer.toString(dayTemps[23]));
        int range = dayTemps[23] - dayTemps[0];
        System.out.println("Range of temps today was a significant "+ Integer.toString(range)+" degrees");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: index out of range - make sure to provide a valid range between 1-24");
        }





    }
}