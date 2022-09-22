package pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SaveStudent {

	public static void main(String[] args) {
		
		
		Student s = new Student();
		
		s.setAddress("Chennai, India");
        s.setName("Madhu");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("simha"); // check persistence file
		
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction =   entityManager.getTransaction();
		
		transaction.begin();
		
		entityManager.persist(s);
		
		transaction.commit();
		
		entityManagerFactory.close();
		
		
	}

}
