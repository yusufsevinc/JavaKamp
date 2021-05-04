package javaHomeWork4;

public class Main {

	public static void main(String[] args) {
		
		StarbucksCustomer yusuf = new StarbucksCustomer(1,"yusuf", "sevinç", "11111111111");
		
	  //	BaseCustomerManager bcm = new StarbucksCustomerManager(new CustomerCheckManager());
		
		StarbucksCustomerManager scm = new StarbucksCustomerManager(new CustomerCheckManager());
		
		
		scm.save(yusuf);
		scm.addStar(yusuf);
		scm.addStar(yusuf);

		System.out.println(yusuf.getSumStar());
		
		
	}

}
