package utilities;

public class LoggingUtility {

	public static LoggingUtility instance;
	
	private boolean debug_enabled;
	
	public static LoggingUtility getInstance(){
		if (instance == null){
			instance = new LoggingUtility();
		}
		return instance;
	}
	
	private LoggingUtility(){
		debug_enabled = false;
	}
	
	public void logString(LogSeverityEnum severity, String log){
		
		switch (severity){
		case DEBUG:
			log = "[DEBUG]: " + log;
			break;
			
		case CRITICAL:
			log = "[CRITICAL]: " + log;
			break;
			
		case EXCEPTION:
			log = "[EXCEPTION]: " + log;
			break;
			
		default:
			break;		
		}
		
		if (severity == LogSeverityEnum.DEBUG){
			if (debug_enabled){
				//TODO: log to window
			}
		}
		else{
			//TODO: log to window
		}
		
		// always log in the console
		System.out.println(log);
		
	}
	
	
}
