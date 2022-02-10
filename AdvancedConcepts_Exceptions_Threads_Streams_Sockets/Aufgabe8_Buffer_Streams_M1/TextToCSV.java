package Aufgabe8_Buffer_Streams_M1;

import java.io.*;

public class TextToCSV {
    private static String INPUTPATH = "Aufgabe8_Buffer/input.txt";
    private static String OUTPUTPATH = "Aufgabe8_Buffer/output.csv";

    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(new File(
                INPUTPATH)));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
                OUTPUTPATH)));

        String line;
        while ((line = br.readLine()) != null) {
            if (line.trim().length() == 0) {
                bw.write("\n");
            } else {
                bw.write(line + ";");
            }
        }

        br.close();
        bw.close();
    }
}
