package de.github.robokit;
/**
 * Handle Commands of Remote Shell 
 * Use /help for Command list
 * @author Fabian Cernota
 *
 */
public class CommandHandler {
	String Command;
	Logger log = new Logger();
public CommandHandler(String Command) {
	this.Command = Command;
}
	/**
	 * Check Commands
	 * 
	 * @return Show Result
	 */
	public String befehl() {
		// TODO Auto-generated method stub
		if(Command.equalsIgnoreCase("/help")){
			log.Info("Help Command send");
			return "See Documentation";
			
		}else if(Command.equalsIgnoreCase("/shutdown")){
			log.Error("**Shutdown**");
			System.exit(-1);
			
		}else{
			log.Error("**Command not found**");

			return "--Not found--";	
					}
		return "--Not found--";
		
	}
}
