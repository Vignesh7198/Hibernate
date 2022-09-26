package one_to_many_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_many_uni.entity.Mobile;
import one_to_many_uni.entity.Sim;

public class SaveMobile {

	public static void main(String[] args) {
 
		List<Sim> sims = new ArrayList();
		Sim sim1 = new Sim();
		
		sim1.setProviderName("jio");
		sim1.setSimNumber(9677015116l);
		
        Sim sim2 = new Sim();
		
		sim2.setProviderName("Airtel");
		sim2.setSimNumber(9940615522l);
		
		sims.add(sim1);
		sims.add(sim2);
		Mobile mobile = new Mobile();
		
		mobile.setMobileName("Iphone 13");
		mobile.setBrand("Apple");
		mobile.setCost(50000.0);
		mobile.setList(sims);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("simha");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(mobile);
		
		entityTransaction.commit();
	}

}
