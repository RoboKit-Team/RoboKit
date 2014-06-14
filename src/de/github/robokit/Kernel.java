package de.github.robokit;
/**
 * Head of KI
 * Control the Brain
 * @see Brain
 * @author Fabian Cernota
 * 
 */
public class Kernel {
//	Change if need
final static Boolean isDebug = true;


static Logger log = new Logger();
/**
 * Start of Programm -> get Instance of Remote Shell
 * @param args
 */
	public static void main(String[] args) {
		log.Info("Projekt 14 \n 0.0.1 \n (c)Fabian Cernota | Maurice Schneider \n Shell started");
		getShell();
		
	}
/**
 * Create Shell Instance
 */
	private static void getShell() {
		Shell s = new Shell();
		s.start();
		
	}

}
