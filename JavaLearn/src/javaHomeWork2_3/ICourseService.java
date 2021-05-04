package javaHomeWork2_3;

import java.util.ArrayList;

public interface ICourseService {
	
	void courseAdd(Course course);
	
	void courseDelete(Course courses);
	
	ArrayList<Course>  courseGetAll();
	

	

}
