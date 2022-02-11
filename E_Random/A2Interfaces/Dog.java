package E_Random.A2Interfaces;

public class Dog implements Streichelbar {

    int size;
    double weight;
    String color;
    boolean aggressive;

    public Dog ( int size, double weight , String color, boolean aggressive){
        this.color= color;
        this.weight=weight;
        this.size=size;
        this.aggressive=aggressive;
    }

    public int changeWeight ( int weight){
        weight += 3.1;
        return weight;
    }

    @Override
    public double weight() {
        return 12.5;
    }

    @Override
    public boolean aggressive() {
        return false;
    }
}
