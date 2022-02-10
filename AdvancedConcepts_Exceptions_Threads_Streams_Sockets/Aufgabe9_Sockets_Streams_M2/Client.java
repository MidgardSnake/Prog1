package Aufgabe9_Sockets_Streams_M2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("localhost", 9999);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream())); // hier wieder ein Stream
        /*
        hier bekommen wir von einem Server einen Input, daher InputStreamReader und dieser bekommt socket und die
        dazugehörigen daten wie localhost und portschlüssel
        */
        String line;
        while( (line = br.readLine()) != null){
            System.out.println(line);
        }
        s.close();
    }
}
