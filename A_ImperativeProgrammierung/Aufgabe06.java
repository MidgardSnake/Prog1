package A_IP;

public class Aufgabe06 {

    public static void main(String[] args) {

        double[] arrx = {Math.pow(10, 20), 1223, Math.pow(10, 18), Math.pow(10, 15), 3, -Math.pow(10, 12), 2};
        double[] arry = {Math.pow(10, 20), 2, -Math.pow(10, 22), Math.pow(10, 13), 2111, Math.pow(10, 16)};

        double result = arrx[0] * arry[0] + arrx[1] * arry[1] + arrx[2] * arry[2] + arrx[3] * arry[3] + arrx[4] * arry[4] + arry[5] * arrx[5];
        System.out.println(result);



        int x = 192119201;
        int y = 35675640;
        float rslt01 = (float) (1/107751*(1682*x*y*y+3*x*x*x+29*x*y*y-2*Math.pow(x,5)+832));
        System.out.println(rslt01);

        double rslt02 = x*y*y/(107751)*(1682*y*y+29)+x*x*x/107751*(3-2*x*x)+832/107751;
        System.out.println(rslt02);


    }

}
