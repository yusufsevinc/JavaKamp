package javaHomeWork2_3;

import java.util.ArrayList;

public class CourseManager implements ICourseService {
	
	private ArrayList<Course> courseList = new ArrayList<Course>();

	@Override
	public void courseAdd(Course course) {
		
		courseList.add(course);
		System.out.println(course.getName() + " eklendi");
		
		
	}

	@Override
	public void courseDelete(Course course) {
		courseList.remove(course);
		System.out.println("Kurs silindi.");
		
	}

	@Override
	public ArrayList<Course> courseGetAll() {
		
		return courseList;
	}
	
	

}
