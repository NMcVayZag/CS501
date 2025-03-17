package Final.lastQuestion;
import java.util.*;

public class AnimalsDriver {
    public static void main(String[] args) {
        ArrayList<Animals> animals = new ArrayList<Animals>();
        Animals jacob = new Cat("Jacob", "meerr", "feather");
        Animals davis = new Cat("Davis", "meerrk", "fake mouse");
        Animals tob = new Cat("Tob", "terrr", "lamp");
        Animals aleg = new Dog("Aleg", "roof", "football");
        Animals maka = new Dog("Maka", "boorkk boork", "tennisball");
        Animals ryguy = new Dog("Ryguy", "arff", "soccerball");
        animals.add(jacob);
        animals.add(davis);
        animals.add(tob);
        animals.add(aleg);
        animals.add(maka);
        animals.add(ryguy);

        System.out.println("before sort");
        for (Animals animal: animals) {
            System.out.println(animal.getName());
        }
        insertionSort(animals);

        System.out.println("\npost sorting:\n");
        for (Animals animal: animals) {
            System.out.println(animal.getName());
            System.out.println(animal.toString());
        }
    }


    public static void insertionSort(ArrayList<Animals> animals)
    {
        for (int i = 1; i <animals.size(); i++){
            Animals key = animals.get(i);
            int position = i;
            while (position > 0 && animals.get(position-1).getName().compareTo(key.getName()) >0)
            {
                animals.set(position, animals.get(position -1));
                position--;
            }
            animals.set(position, key);
        }
    }
}
