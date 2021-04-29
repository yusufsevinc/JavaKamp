package javaHomeWork2;

public class Educator {
	private int educatorId;
	private String name;
	
	public Educator(int educatorId, String name) {
		super();
		this.educatorId = educatorId;
		this.name = name;
	}

	public Educator() {
		super();
	}

	public int getEducatorId() {
		return educatorId;
	}

	public void setEducatorId(int educatorId) {
		this.educatorId = educatorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Educator [educatorId=" + educatorId + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
