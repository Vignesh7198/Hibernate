package pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RetrieveStudent {

	public static void main(String[] args) {

		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("simha");
		
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
Student student = entityManager.find(Student.class, 2);

System.out.println(student.getName());
System.out.println(student.getAddress());
 
	}

}
