package A_IP;

public class Aufgabe05Raviolta {

    public static void main(String[] args) {
        double u=15;
        double h=40;

        double l = Math.sqrt(Math.pow(u,2)+Math.pow(h,2));
        System.out.println(l);

        double l01 = Math.sqrt(u*u+h*h);
        System.out.println(l01);

        double d = u/Math.PI;
        System.out.println(d);

        double fläche = Math.PI*((d/2)*(d/2));
        System.out.println(fläche);

        double mantelfläche = u*h;
        System.out.println(mantelfläche);

        double gesamtfläche = 2*fläche+mantelfläche;
        System.out.println(gesamtfläche);

        double volumen = fläche*h;
        System.out.println(volumen);



    }
}
