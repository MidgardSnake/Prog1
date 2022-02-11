package E_Random.A1;

public class ID_Generation {

    static long nextID =0;
    long emplyeeID = nextID++;

    public boolean print (){
        System.out.println(ID_Generation.nextID);
        return false;
    }

    public static void main(String[] args) {
        ID_Generation emplA = new ID_Generation();
        ID_Generation emplB = new ID_Generation();

        System.out.println(emplA);
        System.out.println(emplB);
    }

}
