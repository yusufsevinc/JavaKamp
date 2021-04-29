package javaHomeWork2;

import java.util.ArrayList;

public class EducatorManager implements IEducatorService{
	
	private ArrayList<Educator> educatorList = new ArrayList<Educator>();

	@Override
	public void educatorAdd(Educator educator) {
		
		educatorList.add(educator);
		System.out.println(educator.getName() + " eklendi.");
	}

	@Override
	public void educatorDelete(Educator educator) {
		
		System.out.println(educator.getName() + " silindi.");
		educatorList.remove(educator);
		
	}
	
	

}
