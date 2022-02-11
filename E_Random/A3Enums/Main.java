package E_Random.A3Enums;

public class Main {

    public static void main(String[] args) {

        RallyeCars rallyeCar1 = RallyeCars.Griffin;
        RallyeCars rallyeCar2 = RallyeCars.Orc;
        RallyeCars rallyeCar3 = RallyeCars.Raptor;
        RallyeCars rallyeCar4 = RallyeCars.Shark;
        RallyeCars rallyeCar5 = RallyeCars.Spider;
        System.out.println();

        RallyeCars allCars []= RallyeCars.values();
        for ( RallyeCars rallyeCars : allCars) {
            System.out.println(rallyeCars);
        }

        System.out.println();

        System.out.println("Griffin difficulty:"+RallyeCars.Griffin.difficulty);


    }
}
