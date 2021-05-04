package homeWorkDay4_3.customer;

import java.util.List;

import homeWorkDay4_3.game.Game;

public class Customer {
	private int id;
	private String name;
	private String lastName;
	private double balance;
	private List<Game> games;
	
	
	
	public Customer() {
		super();
	}



	public Customer(int id, String name, String lastName , double balance) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.balance = balance;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	

}
