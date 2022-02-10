package Aufgabe9_Sockets_Streams_M1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TimeServer {

	// Simple Date Format Patterns
	// http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(9999);
			Socket s = server.accept();
			BufferedWriter os = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));) {
						

			String result = new Date().toString();
			System.out.println(result);
			os.write(result);			
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
