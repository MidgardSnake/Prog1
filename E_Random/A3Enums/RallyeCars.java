package E_Random.A3Enums;

public enum RallyeCars {
    Spider ("medium"), Raptor ("hard"), Griffin("very hard") , Orc ("easy") , Shark("medium");

    String difficulty;

     RallyeCars(String d ){
        this.difficulty=d;
    }
}
