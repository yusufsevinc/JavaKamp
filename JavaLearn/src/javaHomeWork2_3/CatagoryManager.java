package javaHomeWork2_3;

import java.util.ArrayList;

public class CatagoryManager implements ICatagoryManager{
	
	ArrayList<Catagory> catagoryList = new ArrayList<Catagory>();

	@Override
	public void catagoryAdd(Catagory catagory) {
		catagoryList.add(catagory);
		System.out.println(catagory.getName() + " eklendi.");
		
	}

	@Override
	public void catagoryDelete(Catagory catagory) {
		catagoryList.remove(catagory);
		System.out.println(catagory.toString() + "\n"
				+ "silindi.");
		
	}

}
