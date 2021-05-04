package homeWorkDay4_3.game;

import homeWorkDay4_3.campaign.Campaign;

public class Game{
	private int id;
	private String name;
	private double price;
	private Campaign campaign;
	
	public Game() {
		super();
	}

	public Game(int id, String name, double price , Campaign campaign) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.campaign = campaign;
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

	public double getPrice() {
		if(campaign == null) {
			return price;
		}else {
			return price - (price *( campaign.getDiscount() / 100));
		}
		
	}

	public void setPrice(double price) {
		
		this.price = price;
	}
	
	
	
	

}
