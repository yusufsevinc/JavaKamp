package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class LoggerManager implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
	}
	

}
