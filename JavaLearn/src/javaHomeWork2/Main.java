package javaHomeWork2;

import java.util.ArrayList;

public class Main{

	public static void main(String[] args) {
		
		EducatorManager em = new EducatorManager();
		em.educatorAdd(new Educator(2,"engin"));
		
		CatagoryManager cm = new CatagoryManager();
		cm.catagoryAdd(new Catagory(3,"Software"));
		
		Course jc =  new JavaCourse();
		
		jc.setId(1);
		jc.setName("Java");
		jc.setEducatorId(2);
		jc.setUnitPrice(1250);
		jc.setCatogoryId(3);
		((JavaCourse) jc).setActive(true);
		
		
		
		CSharpCourse cs =  new CSharpCourse();
		cs.setId(2);
		cs.setName("CSharp");
		cs.setEducatorId(2);
		cs.setUnitPrice(1500);
		cs.setCatogoryId(3);
		cs.setActive(false);
		
		PythonCourse python =  new PythonCourse();
		python.setId(3);
		python.setName("Python");
		python.setEducatorId(2);
		python.setUnitPrice(500);
		python.setCatogoryId(3);
		python.setActive(true);
		
		CourseManager courseManager = new CourseManager();
		courseManager.courseAdd(jc);
		courseManager.courseAdd(python);
		courseManager.courseAdd(cs);
		
		
		ArrayList<Course> courses = courseManager.courseGetAll();
		
		for (Course course : courses) {
			System.out.println(course.toString());
			
		}

		

		
		

	}

}
