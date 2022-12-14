package kodlamaio.dataAccess;

import java.util.ArrayList;

import kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao {
	ArrayList<Course> courses = new ArrayList<Course>();

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile kurs veritabanına eklendi!");
		
	}

	@Override
	public boolean check(String title) {
		for(Course course : courses) {
			if(course.getCourseTitle().equalsIgnoreCase(title)){
				return true;
			}
		}
		
		return false;
	}
	

}
