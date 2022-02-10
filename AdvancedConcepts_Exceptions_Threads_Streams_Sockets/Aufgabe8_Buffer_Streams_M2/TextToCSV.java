package Aufgabe8_Buffer_Streams_M2;

import java.io.*;

public class TextToCSV {


	private static String INPUTPATH = "/Users/lui/Desktop/AdvancedConcepts/Lîsungen/Aufgabe8_Buffer_M2/input.txt";
	// such dir deinen path mit rechtsklick auf inputdatei, copy - copy path

	private static String OUTPUTPATH = "/Users/lui/Desktop/AdvancedConcepts/Lîsungen/Aufgabe8_Buffer_M2/output.csv";
	// hier ändern wir txt zu csv, das sind sehr rudimentäre formate .. pdf hätte zuviele metadaten, kommt später :-)
	public static void main(String[] args) throws IOException , FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(INPUTPATH)); // sind beides Streams
		BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUTPATH));

		String line;
		while ((line = br.readLine()) != null) { // solange Wert von br.readline ungleich null-Spaces zählen aber auch
			if (line.trim().length() == 0) {  // trim()==0  schneidet Leerzeichen am vorderen und hinteren Rand ab
				bw.write("\n");		// schreibe die zeile in BufferedWriter
			} else {
				bw.write(line + ";");
			}
		}

		br.close();
		bw.close();
	}

}
