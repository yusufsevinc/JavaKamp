package javaHomeWork4;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIRealPerson(Customer customer) {
		if(customer.getFirstName() == "yusuf") {
			return true;
		}
		return false;
	}

}
