package kodlamaio.dataAccess;

import kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eğitmen veritabanına eklendi!");		
	}
	
	

}
