package week_6.meet;

public class meet {

    public static void Printer(String[] args){
        for(String arg : args){
            System.out.println(arg);
        }
    }
    public static void main(String[] args) {
        String[] innerPlanets = new String[]{"Mercury", "Venus", "Earth", "Mars"};
        //System.out.println(innerPlanets[10]);
        Printer(innerPlanets);
        Planet mercury = new Planet("Mercury", "0.38");
        Planet venus = new Planet("Venus", "0.95");
        Planet earth = new Planet("Earth", "1.0");
        Planet mars = new Planet("Mars", "0.53");

        String[][] planets = {
            {mercury.getName(), mercury.getSizeInEarths()},
            {venus.getName(), venus.getSizeInEarths()},
            {earth.getName(), earth.getSizeInEarths()},
            {mars.getName(), mars.getSizeInEarths()},
        };
        for(int i = 0; i < planets.length; i++){
            System.out.println("Planet "+planets[i][0]+" is equal to the size of "+planets[i][1]+ " many earths.");
        }

        int numRows = 2;
        String[][] seatPlans = new String[][]{
            {"22a","22b","22c"},
            {"23a","23b","23c"}
        };
        String[][] seats = new String[numRows][3];

        for (int i=0; i<numRows; i++){
            for (int a=0; a<seatPlans[0].length;a++){
                seats[i][a] = seatPlans[i][a];
                System.out.println(seats[i][a]);
            }
        }

    }
    
}
