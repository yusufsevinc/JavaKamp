package javaHomeWork4;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService ccs;

	public StarbucksCustomerManager(ICustomerCheckService ccs) {
		super();
		this.ccs = ccs;

	}

	@Override
	public void save(Customer customer) {
		if (ccs.checkIRealPerson(customer)) {

			super.save(customer);
		} else {

		}

	}

	public void addStar(StarbucksCustomer customer) {

		customer.setSumStar(customer.getSumStar() + 1);
	}

}
