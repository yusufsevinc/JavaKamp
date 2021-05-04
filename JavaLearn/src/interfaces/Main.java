package interfaces;

public class Main {

	public static void main(String[] args) {
	//	CustomerManager cm = new CustomerManager(new DatabaseLogger());
		ILogger[] loggers = {new DatabaseLogger(),new SmsLogger()};
		CustomerManager cm = new CustomerManager(loggers);
		Customer yusuf = new Customer(1,"Yusuf" ,"Sevinç");
		cm.add(yusuf);

	}

}
