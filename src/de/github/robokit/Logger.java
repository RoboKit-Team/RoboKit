package de.github.robokit;
/**
 * Logger of KI Write to Shell
 * @author Fabian Cernota
 *
 */
public class Logger {

	public Logger() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Info() give out Info Message
	 * @param Message for Sysout
	 */
	public void Info(String Message){
		if(Kernel.isDebug == true){
		System.out.println("[INFO]" + Message);
		}
	}
	/**
	 * Error() give out an Error Message
	 * @param Message for Syserr
	 */
	public void Error(String Message){
		if(Kernel.isDebug == true){
		System.err.println("[ERROR]" + Message);
		}
	}
}
