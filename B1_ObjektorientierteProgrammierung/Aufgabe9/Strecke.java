package B2_OOP.Aufgabe9;

public class Strecke {

    private Punkt p;
    private Punkt q;

    public Strecke ( Punkt p, Punkt q){
        this.p=p;
        this.q=q;
    }

    void read (){
        p.read();
        q.read();
    }

    double getLaenge(){
        double laenge = Math.sqrt(Math.pow(p.getX()- q.getX(),2)+Math.pow(p.getY()-q.getY(),2));
        return laenge;
    }

    public String toString(){
        return p.toString()+"_"+q.toString();
    }
}
