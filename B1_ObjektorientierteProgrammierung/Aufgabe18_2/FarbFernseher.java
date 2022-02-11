package B2_OOP.Aufgabe18_2;

public class FarbFernseher extends Fernseher{

    private int color;

    public FarbFernseher(String ra, int vo, int pr, int color){
        super(ra,vo,pr);
        this.color= Math.max(0,Math.min(color,50));
    }

    public void change(String einstell, int wert) {
        if(einstell=="color"){
            color += wert;
            color = Math.max(0,Math.min(color,50));

        }else
        super.change(einstell, wert);
    }

    public boolean istAngenehmerAls (FarbFernseher anderer){
        return getVolume()< anderer.getVolume()
                && color <40 && color > anderer.color;
    }


    @Override
    public String toString() {
        return super.toString()+", color = "+color;
    }

}
