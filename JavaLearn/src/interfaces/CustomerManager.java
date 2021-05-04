package interfaces;

public class CustomerManager {
	private ILogger[] loggers;
	public CustomerManager(ILogger[] loggers) {
	
		this.loggers = loggers;
	}
	
//	TEK BRÝ LOG GÖNDERME
//	private ILogger logger;
//	public CustomerManager(ILogger logger) {
//	
//		this.logger = logger;
//	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi ." + customer.getFirstName());
//		for (ILogger iLogger : loggers) {
//			iLogger.log(".");
//		}
		Utils.runLogger(loggers, "message");
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstName());
		for (ILogger iLogger : loggers) {
			iLogger.log(".");
		}

	}

}
