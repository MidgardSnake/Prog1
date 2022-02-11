package B2_OOP.Aufgabe18_1;

public class FarbFernseher extends Fernseher {

    private int color;


    private FarbFernseher(String raum, int volume, int program, int color) {
        super(raum, volume, program);
        this.color = Math.max(0, Math.min(color, 50));

    }

    public void change(String einstell, int wert) {
        if (einstell.equals("color")) {
            color = color + wert;
            color = Math.max(0, Math.min(color, 50));
        } else
            super.change(einstell, wert); // warum super.change?
    }

    public boolean istAngenehmerAls(FarbFernseher anderer) {
        return getVolume() < anderer.getVolume() && color < 40 && color > anderer.color;
    }


    public String toString() {
        return super.toString() + ", color = " + color;
    }
}
