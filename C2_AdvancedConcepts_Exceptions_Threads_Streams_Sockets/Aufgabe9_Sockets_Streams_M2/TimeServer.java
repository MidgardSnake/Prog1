package Aufgabe9_Sockets_Streams_M2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeServer {

    public static void main(String[] args) {

        /*
        try & catch ermöglicht, dass wir am Ende nicht mehr close()methode schreiben
         */
        try (ServerSocket server = new ServerSocket(9999);
             Socket s = server.accept();  // Socket wartet darauf accepted zu werden (sobald Verbindung da ist)
             // sobald Verbindung da, wird ein Socket zurückgegeben als BufferedWriter
             BufferedWriter os = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));) {



            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy, kk:mm:ss"); // OutputStream bekommt datum
            String result = sdf.format(new Date());     // ändert datum in ein format
            System.out.println(result);

            os.write(result);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
