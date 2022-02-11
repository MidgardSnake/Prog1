package A_IP;

public class Aufgabe04 {

    public static void main(String[] args) {
        int sec = 158036521;
        System.out.println(sec);

        int years = sec / (60 * 60 * 24 * 365);
        sec %=(60 * 60 * 24 * 365);
        int days = sec / (60 * 60 * 24);
        sec %=(60 * 60 * 24);
        int hours = sec / (60 * 60);
        sec = sec % (60 * 60);
        int minutes = sec / 60;
        sec = sec % 60;

        System.out.println(years + "years");
        System.out.println(days + "days");
        System.out.println(hours + "hours");
        System.out.println(minutes + "minutes");
        System.out.println(sec + "seconds");

    }
}
