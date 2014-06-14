package de.github.robokit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * <b> Remote Shell</b><br />
 * Connect via Telnet to port 13000
 * 
 *   
 * @author Fabian Cernota
 *
 */
public class Shell extends Thread {
@Override
public void run() {
//	if(Settings.getDebug() == true){
//		System.out.println("Server Thread Started");
//	}
	try{
	ServerSocket ss = new ServerSocket(13000);
    Socket clientSocket = ss.accept();
    
    //Die Rückgabe in einen Ausgabestream schreiben:
    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
   
    //Senden eines Newline sorgt dafür, dass der PrintWriter die Ausgabe "abschickt". Alternativ müsste "flush" aufgerufen werden.
    out.println("RoboKit");
    out.println("=========");
    out.println("Version 0.0.1");
    out.println("=========");
    out.println("(c)RoboKit Team");
    out.println("/help für befehl");

	BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	
	while(true){
		String str = br.readLine();
		CommandHandler ch = new CommandHandler(str);
		String ausgabe = ch.befehl();
		out.println(ausgabe);
	}
	}catch(Exception e){
		
	}

	super.run();
}
}
