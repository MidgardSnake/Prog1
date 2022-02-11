package B2_OOP.Aufgabe8;

public class Sound {

    public String room;
    public int lautstärke;
    public int bass;
    public int height;

    public Sound ( String room, int volume, int bass, int height){
        this.room = room;
        this.lautstärke=volume;
        this.bass= bass;
        this.height=height;
    }

    public int getLautstärke() {
        return lautstärke;
    }

    public void verstaerke( String regler, int wert){
      switch (regler){
          case "lautstärke": lautstärke+=wert;
          case "bass": bass += wert;
          case "height": height+=wert;
      }
    }

    public String toString(){
        return "Anlage im Raum "+room+": la"+lautstärke+", ba:"+bass+", ho:"+height;
    }
}
