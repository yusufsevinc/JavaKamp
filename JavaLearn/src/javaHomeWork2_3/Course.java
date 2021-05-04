package javaHomeWork2_3;

public class Course {
	private int id;
	private String name;
	private int educatorId;
	private double unitPrice;
	private int catogoryId;
	
	
	
	public Course() {
		super();
	}
	
	
	
	public Course(int id, String name, int educatorId, double unitPrice, int catogoryId) {
		super();
		this.id = id;
		this.name = name;
		this.educatorId = educatorId;
		this.unitPrice = unitPrice;
		this.catogoryId = catogoryId;
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
	public int getEducatorId() {
		return educatorId;
	}
	public void setEducatorId(int educatorId) {
		this.educatorId = educatorId;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getCatogoryId() {
		return catogoryId;
	}
	public void setCatogoryId(int catogoryId) {
		this.catogoryId = catogoryId;
	}
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", educatorId=" + educatorId + ", unitPrice=" + unitPrice
				+ ", catogoryId=" + catogoryId + "]";
	}
	
	
	
	
	

}
