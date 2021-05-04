package javaHomeWork4;

public class StarbucksCustomer extends Customer {
	private int sumStar = 0;
	
	public StarbucksCustomer(int id , String firstName ,String lastName,String identityNumber) {
		super();
		super.setId(id);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		super.setIdentityNumber(identityNumber);
		
		
	}

	public int getSumStar() {
		return sumStar;
	}

	public void setSumStar(int sumStar) {
		this.sumStar = sumStar;
	}
	

	

}
