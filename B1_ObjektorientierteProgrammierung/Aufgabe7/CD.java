package B2_OOP.Aufgabe7;

public class CD {

    public String title;
    public double time;
    public boolean state;

    public CD(String title, double time, boolean state){
        this.title = title;
        this.time = time;
        this.state = state;
    }

    public String toString (){
        return "Title: \""+title+"\" , Time: \""+time+"\"";
    }
}
