package interfaces;

public class Utils {
	public static void runLogger(ILogger[] loggers ,String message) {
		for (ILogger ilogger : loggers) {
			ilogger.log("mesaj");
			
		}
	}

}
