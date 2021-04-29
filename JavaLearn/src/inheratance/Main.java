package inheratance;


public class Main {

	public static void main(String[] args) {
		IndividualCustomer  yusuf = (IndividualCustomer) new Customer();
		
		CorporateCustomer sevincElektrik = new CorporateCustomer();
		
		CustomerManager cm = new CustomerManager();
		cm.add(yusuf);
		cm.add(sevincElektrik);
		
		

	}

}
