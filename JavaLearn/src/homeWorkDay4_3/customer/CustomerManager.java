package homeWorkDay4_3.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager  implements ICustomerService , ICustomerControl{ 
	private List<Customer> customers = new ArrayList<Customer>();
   
	@Override
	public void add(Customer customer) {
		if(control(customer)) {
			customers.add(customer);
			System.out.println(customer.getName() + " added.");
		}else {
			System.out.println("Not valid user.");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		customers.remove(customer);
		System.out.println(customer.getName() + " deleted.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return this.customers;
		
	}

	@Override
	public boolean control(Customer customer) {
		if(customer.getName().isEmpty()) {
			return false;
		}else{
			return true;
		}
	}

}
