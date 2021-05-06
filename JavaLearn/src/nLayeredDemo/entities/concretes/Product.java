package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.IEntity;

public class Product  implements IEntity{
	private int id;
	private int catagoryId;
	private String name;
	private double unitPrice;
	private int unitsInStock;
	
	public Product() {
		
	}

	public Product(int id, int catagoryId, String name, double unitPrice, int unitsInStock) {
		
		this.id = id;
		this.catagoryId = catagoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCatagoryId() {
		return catagoryId;
	}

	public void setCatagoryId(int catagoryId) {
		this.catagoryId = catagoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
	
	
	

}
