package homeWorkDay4_3.sales;
import java.util.List;

import homeWorkDay4_3.customer.Customer;
import homeWorkDay4_3.game.Game;


public class Cart {
	private int id;
	private Customer customer;
	private double cartSum;


	public Cart() {
		super();
	}


	

	public Cart(int id, Customer customer) {
		super();
		this.id = id;
		this.customer = customer;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	

	public double getCartSum() {
		return cartSum;
	}


	public void setCartSum(double cartSum) {
		this.cartSum = cartSum;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
	

}
